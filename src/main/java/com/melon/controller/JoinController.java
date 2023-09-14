package com.melon.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.melon.dto.common.LoginDto;
import com.melon.service.common.LoginService;

@Controller
@RequiredArgsConstructor
@RequestMapping("/join")
public class JoinController {
	

	private final LoginService loginService;
	
    @GetMapping
    private String join(){
        return "/common/join";
    }
    
    @PostMapping
    private String join(LoginDto m, RedirectAttributes rttr) {
    	return loginService.join(m, rttr);
    }
    
    @GetMapping("/check")
    private @ResponseBody int check(LoginDto m) {
    	int result = loginService.check(m);
    	return result;
    }
}
