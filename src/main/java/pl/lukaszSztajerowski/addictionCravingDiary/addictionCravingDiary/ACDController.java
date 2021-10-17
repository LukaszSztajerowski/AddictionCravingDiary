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

import javax.persistence.criteria.CriteriaBuilder;
import javax.validation.Valid;
import java.security.Principal;
import java.time.LocalDate;
import java.util.*;

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
        List<AddictionCravingDiary> acdList = user.getAddictionCravingDiary();
        Map<Symptom,Integer> map = new HashMap<>();
        for (Symptom symptom: userSymptomList) {
            map.put(symptom,0);
        }
        AddictionCravingDiary acd = new AddictionCravingDiary();
        acd.setSymptomPowerMap(map);
//        Map<Symptom, Integer> symptomPowerMap = addictionCravingDiary.getSymptomPowerMap();
//        for (Symptom symptom: userSymptomList) {
//            symptomPowerMap.put(symptom,0);
//        }
//        addictionCravingDiary.setSymptomPowerMap(symptomPowerMap);
//        acd.add(addictionCravingDiary);
//        acdService.createACD(addictionCravingDiary);
////
//        log.info("Tworze nowe ACD ");
//        Optional<AddictionCravingDiary> addictionCravingDiary1 = acdService.readACD(2L);
//        log.info(String.valueOf(addictionCravingDiary1));
        model.addAttribute("user", user);
        model.addAttribute("userSymptomList", userSymptomList);
        model.addAttribute("acd", acd);
        model.addAttribute("map",map);
        return "addNewACDForm";
    }

    @PostMapping("/user/addNewACD")
    public String addNewACD(@Valid AddictionCravingDiary acd, BindingResult result,Principal principal, Model model){
        if(result.hasErrors()){
            return "dashboard";
        }
        acdService.createACD(acd);
        String name = principal.getName();
        User user = userServiceImpl.findByUsername(name);
        List<AddictionCravingDiary> addictionCravingDiary = user.getAddictionCravingDiary();
        addictionCravingDiary.add(acd);
        userServiceImpl.updateUser(user);
        model.addAttribute("user", user);
        return "dashboard";
    }
}
