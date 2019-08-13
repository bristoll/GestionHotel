package com.cap.gestionhotel.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView defaultIndex() {
		ModelAndView model = new ModelAndView();
		model.setViewName("index");
		return model;
	}
		
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView login() {
		ModelAndView model = new ModelAndView();
		model.setViewName("login");
		return model;
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView add() {
		ModelAndView model = new ModelAndView();
		model.setViewName("addcliente");
		return model;
	}
}
