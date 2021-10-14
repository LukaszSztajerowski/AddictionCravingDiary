package pl.lukaszSztajerowski.addictionCravingDiary.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.security.Principal;

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
//
        return "redirect:/login";
    }

    @GetMapping("/user/dashboard")
        public String dashboard(Model model, Principal principal){
        String name = principal.getName();
        User user = userServiceImpl.findByUsername(name);
        model.addAttribute("user", user);
        model.addAttribute("userSymptomList", user.getSymptoms());

        return "dashboard";
    }

}
