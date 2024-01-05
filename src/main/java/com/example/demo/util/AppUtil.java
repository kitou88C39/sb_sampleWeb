package com.example.demo.util;

import org.springframework.cglib.core.Local;

import org.springframework.context.MessageSource;

//Application common class
public class AppUtil {

    public static String getMessage(MessageSource messageSource, String key, Object... params) {
        return messageSource.getMessage(key, params, Local.JAPAN);
    }

}