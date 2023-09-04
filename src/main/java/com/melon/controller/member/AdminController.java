package com.melon.controller.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {

    @GetMapping("/admin")
    public String admin() {
        return "member/admin";
    }

    @GetMapping("/song/add")
    public String songAdd() {
        return "song/songAdd";
    }
}
