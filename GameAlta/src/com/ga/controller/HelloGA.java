package com.ga.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloGA {
	
	@RequestMapping("/login")
	public ModelAndView greetings(){
		
		return new ModelAndView("login");
		
	}

}
