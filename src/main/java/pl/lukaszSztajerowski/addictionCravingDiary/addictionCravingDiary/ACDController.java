package pl.lukaszSztajerowski.addictionCravingDiary.addictionCravingDiary;

import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.lukaszSztajerowski.addictionCravingDiary.symptom.Symptom;
import pl.lukaszSztajerowski.addictionCravingDiary.user.User;
import pl.lukaszSztajerowski.addictionCravingDiary.user.UserServiceImpl;

import java.security.Principal;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Log
@Controller
@RequiredArgsConstructor
public class ACDController {

    private final UserServiceImpl userServiceImpl;
    private final ACDService acdService;


    @GetMapping("/user/addNewACD")
    public String addNewACDForm(Model model, Principal principal) {
        User user = userServiceImpl.findByUsername(principal.getName());

        List<Symptom> userSymptomList = user.getSymptoms();
        List<AddictionCravingDiary> acd = user.getAddictionCravingDiary();

        AddictionCravingDiary addictionCravingDiary = new AddictionCravingDiary();
        Map<Symptom, Integer> symptomPowerMap = addictionCravingDiary.getSymptomPowerMap();
        for (Symptom symptom: userSymptomList) {
            symptomPowerMap.put(symptom,0);
        }
        addictionCravingDiary.setSymptomPowerMap(symptomPowerMap);
        acd.add(addictionCravingDiary);
        addictionCravingDiary.setDate(LocalDate.now());
        acdService.createACD(addictionCravingDiary);

        log.info("Tworze nowe ACD ");
        Optional<AddictionCravingDiary> addictionCravingDiary1 = acdService.readACD(2L);
        log.info(String.valueOf(addictionCravingDiary1));
        model.addAttribute("user", user);
        model.addAttribute("userSymptomList", userSymptomList);
        model.addAttribute("symptomPowerMap", symptomPowerMap);
        return "addNewACDForm";
    }


}
