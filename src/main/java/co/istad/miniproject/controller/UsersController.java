package co.istad.miniproject.controller;

import co.istad.miniproject.model.Users;
import co.istad.miniproject.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequiredArgsConstructor
@Controller
@RequestMapping("/user")
public class UsersController {
    private final UserService userService;
    @GetMapping
    String allUser(Model model){
        System.out.println(userService.useInfo());
        model.addAttribute("users",userService.useInfo());
        return "/pages/users/user";
    }

    @GetMapping("/view-profile")
    String viewProfile(){
        return "/pages/users/view-profile";
    }

}

