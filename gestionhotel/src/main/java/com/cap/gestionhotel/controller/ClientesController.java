package com.cap.gestionhotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cap.gestionhotel.model.Clientes;
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
	
}
