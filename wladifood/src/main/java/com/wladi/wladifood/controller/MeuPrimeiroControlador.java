package com.wladi.wladifood.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MeuPrimeiroControlador {
	
	

	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		return "Hello!";
	}

}
