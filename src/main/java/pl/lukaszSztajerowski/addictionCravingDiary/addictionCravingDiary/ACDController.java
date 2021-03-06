package pl.lukaszSztajerowski.addictionCravingDiary.addictionCravingDiary;

import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import pl.lukaszSztajerowski.addictionCravingDiary.symptom.Symptom;
import pl.lukaszSztajerowski.addictionCravingDiary.user.User;
import pl.lukaszSztajerowski.addictionCravingDiary.user.UserServiceImpl;

import javax.validation.Valid;
import java.security.Principal;
import java.util.List;
import java.util.Map;

@Log
@Controller
@RequiredArgsConstructor
public class ACDController {

    private final UserServiceImpl userServiceImpl;


    @GetMapping("/user/addNewACD")
    public String addNewACDForm(Model model, Principal principal) {
        User user = userServiceImpl.findByUsername(principal.getName());
        AddictionCravingDiary acd = new AddictionCravingDiary();
        Map<Symptom, Integer> symptomPowerMap = acd.getSymptomPowerMap();
        for (Symptom symptom : user.getSymptomList()) {
            symptomPowerMap.put(symptom, 0);
        }

        model.addAttribute("user", user);
        model.addAttribute("acd", acd);
        return "addNewACDForm";
    }

    @PostMapping("/user/addNewACDForm")
    public String addNewACD(@Valid AddictionCravingDiary addictionCravingDiary, BindingResult result, Principal principal, Model model) {
        if (result.hasErrors()) {
            return "dashboard";
        }
        String name = principal.getName();
        User user = userServiceImpl.findByUsername(name);
        List<AddictionCravingDiary> acd = user.getAddictionCravingDiary();


        Integer valueSum = 0;
        for (Integer value : addictionCravingDiary.getSymptomPowerMap().values()) {
            valueSum = valueSum + value;
        }
        addictionCravingDiary.setPowerSum(valueSum);
        user.getAddictionCravingDiary().add(addictionCravingDiary);

        userServiceImpl.updateUser(user);
        model.addAttribute("user", user);
        model.addAttribute("acd", acd);
        return "dashboard";
    }
}
