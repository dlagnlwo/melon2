package com.melon.controller.ticket;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/ticket")
@Controller
public class TicketController {
	
	/**
	* 티켓 조회
	* @like 김훈규 (2023.09.05)
	*/
	
	@GetMapping("/sale")
	public String ticket_sale() {
		return "ticket/ticketsale";
	}
}
