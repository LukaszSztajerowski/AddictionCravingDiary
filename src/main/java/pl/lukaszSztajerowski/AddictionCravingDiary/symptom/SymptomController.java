package pl.lukaszSztajerowski.AddictionCravingDiary.symptom;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
@RequiredArgsConstructor
public class SymptomController {
    private final SymptomService symptomService;

    @GetMapping("/add/symptom")
    public String addSymptomForm(Model model) {
        model.addAttribute("symptom", new Symptom());
        return "addSymptomForm";
    }

    @PostMapping("/add/symptom")
    public String addSymptom(@Valid Symptom symptom, BindingResult result){
        if(result.hasErrors()){
            return "add/symptom";
        }
        symptom.setSymptomsPower(0);
        symptomService.createSymptom(symptom);
        return "dashboard";
    }
}
