package com.example.crud.Controller;

import com.example.crud.entity.Login;
import com.example.crud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    public LoginController(UserService userService) {
        super();
        this.userService = userService;
    }
    @GetMapping("/login")
    public String showLogin() {
        return "login";
    }

    //Check for Credentials
    @PostMapping("/login")
    public String login(@ModelAttribute(name="loginForm") Login login, Model model) {
        String uname = login.getUsername();
        String pass = login.getPassword();


        for (Login obj:userService.getAllCredentials()) {
            System.out.println("Username:" + obj.getUsername());
            System.out.println("Password:" + obj.getPassword());
            if(uname.equals(obj.getUsername()) && pass.equals(obj.getPassword())) {
                return "employees";
            }
        };
        model.addAttribute("error", "Incorrect Username & Password");
        return "login";

    }
}