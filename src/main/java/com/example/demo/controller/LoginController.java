package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping("/login")
public class LoginController {

    @GetMapping("path")
    public String view() {
        return "login";
    }

}