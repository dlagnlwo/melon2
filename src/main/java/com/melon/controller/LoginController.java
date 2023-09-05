package com.melon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class LoginController {
    @GetMapping
    private String login(){
        return "/common/login";
    }

    @GetMapping("/melon")
    private String melonLogin(){
        return "/common/melon_login";
    }
}
