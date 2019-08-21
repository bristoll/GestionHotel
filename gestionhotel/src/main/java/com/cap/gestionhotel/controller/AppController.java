package com.cap.gestionhotel.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import com.cap.gestionhotel.model.Clientes;
import com.cap.gestionhotel.model.Hoteles;
import com.cap.gestionhotel.service.ClientesService;
import com.cap.gestionhotel.service.HotelesService;

@Controller
public class AppController {

	@Autowired
	ClientesService clientesService;

	@Autowired
	HotelesService hotelesService;

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

	@GetMapping("/registrar")
	public ModelAndView registrar(ModelAndView modelAndView, HttpServletRequest request) {

		HttpSession session = request.getSession();

		session.setAttribute("ruta", "registrar");

		modelAndView.setViewName("addClientes");
		return modelAndView;
	}

	@GetMapping("/addClientes")
	public ModelAndView addClientes(ModelAndView modelAndView, HttpServletRequest request) {

		HttpSession session = request.getSession();

		session.setAttribute("ruta", "add");

		modelAndView.setViewName("addClientes");
		return modelAndView;
	}

	@GetMapping("/updateClientes/{cli_dni}")
	public ModelAndView updateClientes(ModelAndView modelAndView, @PathVariable String cli_dni) {

		Clientes cliente = clientesService.buscarCliente(cli_dni);

		modelAndView.addObject("clienteUpdate", cliente);

		modelAndView.setViewName("updateClientes");
		return modelAndView;
	}

	@GetMapping("/addHoteles")
	public ModelAndView addHoteles(ModelAndView modelAndView, HttpServletRequest request) {

		HttpSession session = request.getSession();

		session.setAttribute("ruta", "add");

		modelAndView.setViewName("addHoteles");
		return modelAndView;
	}

	@GetMapping("/updateHoteles/{ho_id}")
	public ModelAndView updateHoteles(ModelAndView modelAndView, @PathVariable int ho_id) {

		Hoteles hotel = hotelesService.buscarHoteles(ho_id);

		modelAndView.addObject("hotelesUpdate", hotel);

		modelAndView.setViewName("updateHoteles");
		return modelAndView;
	}

	
	
	@GetMapping("/admin")
	public ModelAndView adminIndex(ModelAndView modelAndView) {
		modelAndView.setViewName("loginAdmin");
		return modelAndView;
	}
	




	@GetMapping("/filtro")
	public ModelAndView filtro(ModelAndView modelAndView) {
		modelAndView.setViewName("filtro");
		return modelAndView;
	}

}
