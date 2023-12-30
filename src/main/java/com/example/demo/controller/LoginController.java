package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.form.LoginForm;

@Controller
public class LoginController {

    @GetMapping
    public String view(Modele model, LoginForm form) {
        return "login";
    }

}