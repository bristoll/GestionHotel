package com.cap.gestionhotel.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
import org.springframework.web.servlet.View;

import com.cap.gestionhotel.model.ClienteLoginDto;
import com.cap.gestionhotel.model.ClienteSimpleDto;
import com.cap.gestionhotel.model.Clientes;
import com.cap.gestionhotel.service.AdminService;
import com.cap.gestionhotel.service.ClientesService;

@Controller
@RequestMapping("/clientes")
public class ClientesController {

	@Autowired
	ClientesService clientesService;

	@Autowired
	AdminService adminService;

	@Autowired
	ClienteLoginDto clienteLoginDto;

	@GetMapping("/lista")
	public ModelAndView listaClientes(ModelAndView modelAndView) {
		modelAndView.addObject("listaClientes", clientesService.listaClientes());
		modelAndView.setViewName("listaClientes");
		return modelAndView;
	}

	@PostMapping("/login")
	public ModelAndView login(ModelAndView modelAndView, @RequestParam Map<String, String> datos,
			HttpServletRequest request) {

		HttpSession session = request.getSession();

		clienteLoginDto.setEmail(datos.get("email"));
		clienteLoginDto.setPass(datos.get("pass"));

		ResponseEntity<ClienteSimpleDto> response = clientesService.login(clienteLoginDto);

		if (response.getStatusCode().equals(HttpStatus.OK)) {
			// modelAndView.addObject("clienteLogin", response.getBody());
			session.setAttribute("clienteLogin", response.getBody());
			modelAndView.setViewName("redirect:/");
		} else {
			modelAndView.setViewName("redirect:/login");
		}

		return modelAndView;
	}

	@GetMapping("/logout")
	public ModelAndView logout(ModelAndView modelAndView, HttpServletRequest request) {

//		modelAndView.addObject("clienteLogin", new ClienteSimpleDto());
		HttpSession session = request.getSession();
		session.invalidate();

		modelAndView.setViewName("redirect:/");
		return modelAndView;
	}

	@PostMapping("/registrar")
	public ModelAndView registrar(ModelAndView modelAndView, @RequestParam Map<String, String> datos,
			HttpServletRequest request) {

		Clientes cliente = new Clientes();

		cliente.setCli_apellido(datos.get("apellido"));
		cliente.setCli_ciudad(datos.get("ciudad"));
		cliente.setCli_codigopos(Integer.parseInt(datos.get("cod")));
		cliente.setCli_direccion(datos.get("dir"));
		cliente.setCli_dni(datos.get("dni"));
		cliente.setCli_email(datos.get("email"));
		cliente.setCli_nombre(datos.get("nombre"));
		cliente.setPassword(datos.get("pass"));

		// attributes.addAttribute("", attributeValue);
		adminService.add(cliente);
		modelAndView.setViewName("redirect:/login");
		return modelAndView;
	}

}
