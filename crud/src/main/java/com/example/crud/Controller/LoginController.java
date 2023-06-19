package com.example.crud.Controller;

import com.example.crud.entity.Login;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class LoginController {
    @GetMapping("/login")
    public String showLogin() {
        return "login";
    }

    //Check for Credentials
    @PostMapping("/login")
    public String login(@ModelAttribute(name="loginForm") Login login, Model model) {
        String uname = login.getUsername();
        String pass = login.getPassword();

        if(uname.equals("Admin") && pass.equals("Admin@123")) {
//            model.addAttribute("uname", uname);
//            model.addAttribute("pass", pass);
            return "employees";
        }
        model.addAttribute("error", "Incorrect Username & Password");
        return "login";

    }
}