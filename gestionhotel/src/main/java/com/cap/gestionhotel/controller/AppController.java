package com.cap.gestionhotel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import com.cap.gestionhotel.model.Clientes;
import com.cap.gestionhotel.service.ClientesService;

@Controller
public class AppController {

	@Autowired
	ClientesService clientesService;
	
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
	
	@GetMapping("/addClientes")
	public ModelAndView addClientes(ModelAndView modelAndView) {
		modelAndView.setViewName("addcliente");
		return modelAndView;
	}
	
	@GetMapping("/updateClientes/{cli_dni}")
	public ModelAndView updateClientes(ModelAndView modelAndView, @PathVariable String cli_dni) {
		
		Clientes cliente =clientesService.buscarCliente(cli_dni);
		
		modelAndView.addObject("clienteUpdate", cliente);
		
		modelAndView.setViewName("updatecliente");
		return modelAndView;
	}
}
