package com.cap.gestionhotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cap.gestionhotel.model.ClienteLoginDto;
import com.cap.gestionhotel.model.ClienteSimpleDto;
import com.cap.gestionhotel.service.ClientesService;


@Controller
@RequestMapping("/clientes")
public class ClientesController {

	@Autowired
	ClientesService clientesService;
	
	@GetMapping("/lista")
	public String listaClientes(Model model) {
		model.addAttribute("listaClientes", clientesService.listaClientes());
		return "listaClientes";
	}
	
	@GetMapping("/login")
	public ModelAndView login(ModelAndView modelAndView, @ModelAttribute("clienteLogin") @Validated ClienteLoginDto clienteLoginDto) {

		ResponseEntity<ClienteSimpleDto> response = clientesService.login(clienteLoginDto);
		
		if (response.getStatusCode().equals(HttpStatus.OK)) {
			modelAndView.addObject("clienteLogin", response.getBody());
			modelAndView.setViewName("listaClientes");
		}else {
			modelAndView.setViewName("index");
		}

		return modelAndView;
	}
	
}
