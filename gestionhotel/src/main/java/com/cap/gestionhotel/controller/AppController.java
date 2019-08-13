package com.cap.gestionhotel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {

	@GetMapping("/")
	public ModelAndView defaultIndex(ModelAndView modelAndView) {
		modelAndView.setViewName("index");
		return modelAndView;
	}
		
	@GetMapping("/login")
	public ModelAndView login(ModelAndView modelAndView) {
		modelAndView.setViewName("login");
		return modelAndView;
	}
	
	@GetMapping("/add")
	public ModelAndView add(ModelAndView modelAndView) {
		modelAndView.setViewName("addcliente");
		return modelAndView;
	}
}
