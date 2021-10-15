package pl.lukaszSztajerowski.addictionCravingDiary.addictionCravingDiary;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.lukaszSztajerowski.addictionCravingDiary.user.User;
import pl.lukaszSztajerowski.addictionCravingDiary.user.UserServiceImpl;

import java.security.Principal;

@Controller
@RequiredArgsConstructor
public class ACDController {

    private final UserServiceImpl userServiceImpl;

    @GetMapping("/user/addNewACD")
    public String addNewACDForm(Model model, Principal principal){
        User user = userServiceImpl.findByUsername(principal.getName());
        model.addAttribute("user", user);
        model.addAttribute("userSymptomList", user.getSymptoms());
        return "addNewACDForm";
    }





}
