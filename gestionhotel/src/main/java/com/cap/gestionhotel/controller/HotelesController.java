package com.cap.gestionhotel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import com.cap.gestionhotel.service.HotelesService;


@Controller
@RequestMapping("/hoteles")
public class HotelesController {

	@Autowired
	HotelesService hotelesService;
	

	@GetMapping("/lista")
	public ModelAndView listaHoteles(ModelAndView modelAndView) {
		modelAndView.addObject("listaHoteles", hotelesService.listaHoteles());
		modelAndView.setViewName("listaHoteles");
		return modelAndView;
	}
	

	
		
}
