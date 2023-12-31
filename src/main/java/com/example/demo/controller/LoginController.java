package com.example.demo.controller;

import org.springframework.context.MessageSource;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.form.LoginForm;
import com.example.demo.service.LoginService;
import com.example.demo.util.AppUtil;

import lombok.RequiredArgsConstructor;

//LoginScreenController
@Controller
@RequiredArgsConstructor
public class LoginController {

    // LoginService
    private final LoginService service;
    // passwordEncoder
    private final PasswordEncoder passwordEncoder;

    private final MessageSource messageSource;

    // Initial display
    // @Param modelモデル
    // @Param form入力情報
    // return 表示画面

    @GetMapping("/login")
    public String view(Model model, LoginForm form) {
        return "login";
    }

    // Login
    // @Param modelモデル
    // @Param form入力情報
    // return 表示画面

    @PostMapping("/login")
    public String login(Model model, LoginForm form) {
        var userInfo = service.searchUserById(form.getLoginId());
        var isCorrectUserAuth = userInfo.isPresent()
                && passwordEncoder.matches(form.getPassword(), userInfo.get().getPassword());
        if (isCorrectUserAuth) {
            return "redirect:/menu";
        } else {
            var errorMsg = AppUtil.getMessage(messageSource, MessageConst.LOGIN_WRONG_INPUT);
            model.addAttribute("errorMsq", errorMsg);
            return "login";
        }
    }
}
