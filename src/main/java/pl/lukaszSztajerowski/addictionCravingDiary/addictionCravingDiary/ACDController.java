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
        AddictionCravingDiary acd = new AddictionCravingDiary();
        acd.setSymptomListOfACD(userSymptomList);

        model.addAttribute("user", user);
        model.addAttribute("userSymptomList", userSymptomList);
        model.addAttribute("acd", acd);

        return "addNewACDForm";
    }

    @PostMapping("/user/addNewACD")
    public String addNewACD(@Valid List userSymptomList , BindingResult result,Principal principal, Model model){
        if(result.hasErrors()){
            return "dashboard";
        }
        AddictionCravingDiary addictionCravingDiary = new AddictionCravingDiary();
        addictionCravingDiary.setSymptomListOfACD(userSymptomList);

        User user = userServiceImpl.findByUsername(principal.getName());
        List<AddictionCravingDiary> addictionCravingDiaryList = user.getAddictionCravingDiary();
        addictionCravingDiaryList.add(addictionCravingDiary);
        acdService.createACD(addictionCravingDiary);
        userServiceImpl.updateUser(user);

        return "dashboard";
    }
}
