package com.melon.controller.like;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LikeController {

	@GetMapping("/like")
	public String like() {
		return "like/like";
	}
}
