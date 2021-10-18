package pl.lukaszSztajerowski.addictionCravingDiary.symptom;

import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import pl.lukaszSztajerowski.addictionCravingDiary.user.User;
import pl.lukaszSztajerowski.addictionCravingDiary.user.UserServiceImpl;

import javax.validation.Valid;
import java.security.Principal;
import java.util.List;

@Log
@Controller
@RequiredArgsConstructor
public class SymptomController {
    private final SymptomService symptomService;
    private final UserServiceImpl userServiceImpl;

    @GetMapping("user/add/symptom")
    public String addSymptomForm(Model model) {
        model.addAttribute("symptom", new Symptom());
        return "addSymptomForm";
    }

    @PostMapping("/user/add/symptom")
    public String addSymptom(@Valid Symptom symptom, BindingResult result, Principal principal, Model model) {
        if (result.hasErrors()) {
            return "/user/add/symptom";
        }
        symptomService.createSymptom(symptom);
        User user = userServiceImpl.findByUsername(principal.getName());
        List<Symptom> symptoms = user.getSymptomList();
        symptoms.add(symptom);
        userServiceImpl.updateUser(user);
        model.addAttribute("user", user);
        return "dashboard";
    }

    @GetMapping("/user/symptomsList")
    public String showSymptoms(Model model, Principal principal) {
        User user = userServiceImpl.findByUsername(principal.getName());
        List<Symptom> symptoms = user.getSymptomList();
        model.addAttribute("user", user);
        model.addAttribute("symptoms", symptoms);
        return "symptomsList";
    }

    @GetMapping("/user/delete/symptom/{id}")
    public String deleteSymptom(@PathVariable Long id) {
        symptomService.deleteSymptom(id);
        return "symptomsList";
    }

    @GetMapping("/user/edit/symptom/{id}")
    public String editSymptomForm(Model model) {
        model.addAttribute("symptom", new Symptom());
        return "editSymptom";//edycja do poprawy
    }

    @PostMapping("/user/edit/symptom/{id}")
    public String editSymptom(@PathVariable Long id, @Valid Symptom symptom, BindingResult result) {
        if (result.hasErrors()) {
            return "symptomsList";
        }
        symptom.setId(id);
        symptomService.updateSymptom(symptom);

        return "symptomsList";

    }
}
