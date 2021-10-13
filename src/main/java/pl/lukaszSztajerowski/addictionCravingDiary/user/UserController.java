package pl.lukaszSztajerowski.addictionCravingDiary.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

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
        public String register(@Valid User user, BindingResult result, Model model){
        if(result.hasErrors()){
            return "register";
        }
        userServiceImpl.createUser(user);
//        model.addAttribute("user", user);
        return "login";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/user/dashboard")
        public String dashboard(){
        return "dashboard";
    }

}
