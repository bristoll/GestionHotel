package com.cap.gestionhotel.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cap.gestionhotel.model.Clientes;
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
		modelAndView.setViewName("redirect:/admin/lista");
		return modelAndView;
	}
	
	@GetMapping("/update/{cli_dni}")
	public ModelAndView update(ModelAndView modelAndView, @PathVariable String cli_dni) {
		
		//attributes.addAttribute("", attributeValue);
		
		modelAndView.setViewName("redirect:/admin/lista");
		return modelAndView;
	}
	
	@PostMapping("/add")
	public ModelAndView add(ModelAndView modelAndView, @RequestParam Map<String,String> datos) {
		Clientes cliente = new Clientes();
		
		cliente.setCli_apellido(datos.get("apellido"));
		cliente.setCli_ciudad(datos.get("ciudad"));
		cliente.setCli_codigopos(Integer.parseInt(datos.get("cod")));
		cliente.setCli_direccion(datos.get("dir"));
		cliente.setCli_dni(datos.get("dni"));
		cliente.setCli_email(datos.get("email"));
		cliente.setCli_nombre(datos.get("nombre"));
		cliente.setPassword(datos.get("pass"));
		
		//attributes.addAttribute("", attributeValue);
		adminService.add(cliente);
		modelAndView.setViewName("redirect:/admin/lista");
		return modelAndView;
	}
	
	@PostMapping("/update")
	public ModelAndView update(ModelAndView modelAndView, @RequestParam Map<String,String> datos) {
		Clientes cliente = new Clientes();
		
		cliente.setCli_apellido(datos.get("apellido"));
		cliente.setCli_ciudad(datos.get("ciudad"));
		cliente.setCli_codigopos(Integer.parseInt(datos.get("cod")));
		cliente.setCli_direccion(datos.get("dir"));
		cliente.setCli_dni(datos.get("dni"));
		cliente.setCli_email(datos.get("email"));
		cliente.setCli_nombre(datos.get("nombre"));
		cliente.setPassword(datos.get("pass"));
		
		//attributes.addAttribute("", attributeValue);
		adminService.update(cliente);
		modelAndView.setViewName("redirect:/admin/lista");
		return modelAndView;
	}
	
}
