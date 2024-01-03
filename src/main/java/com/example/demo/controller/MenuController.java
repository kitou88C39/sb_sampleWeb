package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//MnueScreenController
@Controller
public class MenuController {

    // Initial display

    // return 表示画面

    @GetMapping(("/menu"))
    public String view() {
        return "menu";
    }

}
