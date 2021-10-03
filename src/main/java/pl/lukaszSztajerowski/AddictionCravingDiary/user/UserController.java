package pl.lukaszSztajerowski.AddictionCravingDiary.user;

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
    private final UserService userService;

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
        userService.createUser(user);
        return "login";
    }


    @GetMapping("/login")
        public String loginPage(){
        return "login";
    }

//    @PostMapping("/login")
//        public String login(HttpServletRequest request, HttpServletResponse response){
//
//        return "user";
//    }
// zroibc to przez spring security;
}
