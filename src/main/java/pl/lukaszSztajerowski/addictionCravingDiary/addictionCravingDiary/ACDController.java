package pl.lukaszSztajerowski.addictionCravingDiary.addictionCravingDiary;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.lukaszSztajerowski.addictionCravingDiary.symptom.Symptom;
import pl.lukaszSztajerowski.addictionCravingDiary.user.User;
import pl.lukaszSztajerowski.addictionCravingDiary.user.UserServiceImpl;

import java.security.Principal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequiredArgsConstructor
public class ACDController {

    private final UserServiceImpl userServiceImpl;

    @GetMapping("/user/addNewACD")
    public String addNewACDForm(Model model, Principal principal) {
        User user = userServiceImpl.findByUsername(principal.getName());
        List<Symptom> userSymptomList = user.getSymptoms();
        List<AddictionCravingDiary> acd = user.getAddictionCravingDiary();

        Map<Symptom, Integer> symptomPowerMap = new HashMap<>();
        for (Symptom symptom: userSymptomList) {
            symptomPowerMap.put(symptom,0);
        }
        model.addAttribute("user", user);
        model.addAttribute("userSymptomList", userSymptomList);
        model.addAttribute("symptomPowerMap", symptomPowerMap);
        return "addNewACDForm";
    }


}
