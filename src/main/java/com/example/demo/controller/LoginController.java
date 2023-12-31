package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.form.LoginForm;

@Controller
public class LoginController {

    @GetMapping
    public String view(Modele model, LoginForm form) {
        return "login";
    }

    @PostMapping
    public void login(LoginForm form) {
        System.out.println(LoginForm form);
}
}