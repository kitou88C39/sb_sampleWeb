package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanDefine {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return;
    }
}