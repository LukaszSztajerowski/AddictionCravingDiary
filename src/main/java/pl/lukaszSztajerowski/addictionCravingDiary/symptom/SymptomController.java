package pl.lukaszSztajerowski.addictionCravingDiary.symptom;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import pl.lukaszSztajerowski.addictionCravingDiary.user.User;
import pl.lukaszSztajerowski.addictionCravingDiary.user.UserServiceImpl;

import javax.validation.Valid;
import java.security.Principal;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

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
    public String addSymptom(@Valid Symptom symptom, BindingResult result, Principal principal){
        if(result.hasErrors()){
            return "add/symptom";
        }
        symptom.setSymptomsPower(0);
        symptomService.createSymptom(symptom);
        String name = principal.getName();
        User user = userServiceImpl.findByUsername(name);
        List<Symptom> symptoms = user.getSymptoms();
        symptoms.add(symptom);
        user.setSymptoms(symptoms);

        return "dashboard";
    }

    @GetMapping("/user/symptomsList")
    public String showSymptoms(Model model, Principal principal){
        String name = principal.getName();
        User user = userServiceImpl.findByUsername(name);
        model.addAttribute("symptoms", user.getSymptoms());
        return "symptomsList";
    }
}
