package com.melon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JoinController {
    @GetMapping("/join")
    private String join(){
        return "/common/join";
    }
}
