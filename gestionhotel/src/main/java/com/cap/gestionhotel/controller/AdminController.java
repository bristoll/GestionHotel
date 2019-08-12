package com.cap.gestionhotel.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.cap.gestionhotel.service.AdminService;
import com.cap.gestionhotel.service.ClientesService;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	AdminService adminService;
	
	@GetMapping("/lista")
	public ModelAndView listaClientes(ModelAndView modelAndView) {
		modelAndView.addObject("listaClientes", adminService.listaClientes());
		modelAndView.setViewName("listaClientes");
		return modelAndView;
	}
	
	@GetMapping("/delete/{cli_dni}")
	public ModelAndView delete(ModelAndView modelAndView, @PathVariable String cli_dni) {
		
		adminService.delete(cli_dni);
		modelAndView.addObject("listaClientes", adminService.listaClientes());
		modelAndView.setViewName("listaClientes");
		return modelAndView;
	}
	
	@GetMapping("/delete/{cli_dni}")
	public ModelAndView update(ModelAndView modelAndView, @RequestParam Map<String,String> datos) {
		
		
		
		modelAndView.setViewName("listaClientes");
		return modelAndView;
	}
	
}
