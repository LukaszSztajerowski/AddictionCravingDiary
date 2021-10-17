package pl.lukaszSztajerowski.addictionCravingDiary.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import pl.lukaszSztajerowski.addictionCravingDiary.addictionCravingDiary.AddictionCravingDiary;
import pl.lukaszSztajerowski.addictionCravingDiary.symptom.Symptom;

import javax.validation.Valid;
import java.security.Principal;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class UserController {
    private final UserServiceImpl userServiceImpl;

    @GetMapping("")
        public String homePage(){
        return "home";
    }

    @GetMapping("/register")
        public String registerPage(Model model){
        model.addAttribute("user", new User());
        return "register";
    }

    @PostMapping("/register")
        public String register(@Valid User user, BindingResult result){
        if(result.hasErrors()){
            return "register";
        }
        userServiceImpl.createUser(user);
        return "redirect:/login";
    }

    @GetMapping("/user/dashboard")
        public String dashboard(Model model, Principal principal){
        User user = userServiceImpl.findByUsername(principal.getName());
        List<Symptom> symptoms = user.getSymptoms();
        List<AddictionCravingDiary> acd = user.getAddictionCravingDiary();
//        AddictionCravingDiary lastdiary = acd.get(acd.size() - 1);
        model.addAttribute("user", user);
        model.addAttribute("symptoms", symptoms);
        model.addAttribute("acd", acd);
//        model.addAttribute("last", lastdiary);
        return "dashboard";
    }

}
