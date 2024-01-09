package com.example.demo.controller;

import org.springframework.context.MessageSource;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.constant.MessageConst;
import com.example.demo.form.LoginForm;
import com.example.demo.service.LoginService;
import com.example.demo.service.SignupService;
import com.example.demo.util.AppUtil;

import lombok.RequiredArgsConstructor;

//User registration screen Controller
@Controller
@RequiredArgsConstructor
public class SignupController {

    // User registration screen Service
    private final SignupService service;

    // MessageSource
    private final MessageSource messageSource;

    // Initial displa
    // @Param modelモデル
    // @Param form入力情報
    // return 表示画面

    @GetMapping("/signup")
    public String view(Model model, SignupForm form) {
        return "signup";
    }

    // User registration screen
    // @Param modelモデル
    // @Param form入力情報
    // return 表示画面

    @PostMapping("/signup")
    public void signup(Model model, SignupForm form) {
        var userInfoOpt = service.resistUserInfo(form);
        if (userInfoOpt.isEmpty()) {
            var message = AppUtil.getMessage(messageSource, editMessagekey(userInfoOpt));
            model.addAttribute("message", errorMsg);
       
    }

    private String editMessagekey(Optinal<UserInfo> userInfoOpt) {
        if (userInfoOpt.isEmpty()) {
            return MessageConst.SIGNUP_EXISTED_LOGIN_ID;
        } else {
            return MessageConst.SIGNUP_EXISTED_SUCCEED;
        }
    }
}