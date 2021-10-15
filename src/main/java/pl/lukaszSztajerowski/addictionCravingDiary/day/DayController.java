package pl.lukaszSztajerowski.addictionCravingDiary.day;

import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.lukaszSztajerowski.addictionCravingDiary.symptom.Symptom;
import pl.lukaszSztajerowski.addictionCravingDiary.user.User;
import pl.lukaszSztajerowski.addictionCravingDiary.user.UserServiceImpl;

import java.security.Principal;
import java.util.Arrays;
import java.util.List;

@Log
@Controller
@RequiredArgsConstructor
public class DayController {
    private final UserServiceImpl userServiceImpl;


    @GetMapping("/user/addNewDay")
    public String addNewDayForm(Model model, Principal principal){
        String name = principal.getName();
        User user = userServiceImpl.findByUsername(name);
        List<Symptom> symptoms = user.getSymptoms();
        model.addAttribute("user", user);
        model.addAttribute("symptoms", symptoms);
        model.addAttribute("day", new Day());
        List<Integer> symptomPower = Arrays.asList(0,1,2,3);
        model.addAttribute("symptomPower", symptomPower);
        return "addNewDayForm";
    }
}
