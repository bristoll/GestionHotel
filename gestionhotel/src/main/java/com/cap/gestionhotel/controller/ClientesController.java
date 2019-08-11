package com.cap.gestionhotel.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.cap.gestionhotel.model.ClienteLoginDto;
import com.cap.gestionhotel.model.ClienteSimpleDto;
import com.cap.gestionhotel.service.ClientesService;


@Controller
@SessionAttributes("clienteLogin")
@RequestMapping("/clientes")
public class ClientesController {

	@Autowired
	ClientesService clientesService;
		
	@Autowired
	ClienteLoginDto clienteLoginDto;

	@GetMapping("/lista")
	public ModelAndView listaClientes(ModelAndView modelAndView) {
		modelAndView.addObject("listaClientes", clientesService.listaClientes());
		modelAndView.setViewName("listaClientes");
		return modelAndView;
	}
	
	@PostMapping("/login")
	public ModelAndView login(ModelAndView modelAndView, @RequestParam Map<String,String> datos) {
		
		clienteLoginDto.setEmail(datos.get("email"));
		clienteLoginDto.setPass(datos.get("pass"));
		
		ResponseEntity<ClienteSimpleDto> response = clientesService.login(clienteLoginDto);
		
		if (response.getStatusCode().equals(HttpStatus.OK)) {
			modelAndView.addObject("clienteLogin", response.getBody());
			modelAndView.setViewName("index");
		}else {
			modelAndView.setViewName("login");
		}

		return modelAndView;
	}
	
}
