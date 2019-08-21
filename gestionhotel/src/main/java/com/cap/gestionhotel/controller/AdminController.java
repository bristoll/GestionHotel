package com.cap.gestionhotel.controller;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Properties;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cap.gestionhotel.model.ClienteLoginDto;
import com.cap.gestionhotel.model.ClienteSimpleDto;
import com.cap.gestionhotel.model.Clientes;
import com.cap.gestionhotel.model.Hoteles;
import com.cap.gestionhotel.service.AdminService;
import com.cap.gestionhotel.service.ClientesService;

@Controller
@RequestMapping("/admin")
public class AdminController {
	


	@Autowired
	AdminService adminService;
	
	@GetMapping("/listaClientes")
	public ModelAndView listaClientes(ModelAndView modelAndView) {
		modelAndView.addObject("listaClientes", adminService.listaClientes());
		modelAndView.setViewName("listaClientes");
		return modelAndView;
	}
	
	@GetMapping("/deleteClientes/{cli_dni}")
	public ModelAndView deleteClientes(ModelAndView modelAndView, @PathVariable String cli_dni) {
		
		adminService.deleteClientes(cli_dni);
		modelAndView.addObject("listaClientes", adminService.listaClientes());
		modelAndView.setViewName("redirect:/admin/listaClientes");
		return modelAndView;
	}
	
	
	@PostMapping("/addClientes")
	public ModelAndView addClientes(ModelAndView modelAndView, @RequestParam Map<String,String> datos) {
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
		adminService.addClientes(cliente);
		modelAndView.setViewName("redirect:/admin/listaClientes");
		return modelAndView;
	}
	
	@PostMapping("/updateClientes")
	public ModelAndView updateClientes(ModelAndView modelAndView, @RequestParam Map<String,String> datos) {
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
		adminService.updateClientes(cliente);
		modelAndView.setViewName("redirect:/admin/listaClientes");
		return modelAndView;
	}
	
	//--------------------------------------------------------------------------------------------------------------//
	
	
	@GetMapping("/listaHoteles")
	public ModelAndView listaHoteles(ModelAndView modelAndView) {
		modelAndView.addObject("listaHoteles", adminService.listaHoteles());
		modelAndView.setViewName("listaHoteles");
		return modelAndView;
	}
	
	@GetMapping("/deleteHoteles/{ho_id}")
	public ModelAndView deleteHoteles(ModelAndView modelAndView, @PathVariable int ho_id) {
		
		adminService.deleteHoteles(ho_id);
		modelAndView.addObject("listaHoteles", adminService.listaHoteles());
		modelAndView.setViewName("redirect:/admin/listaHoteles");
		return modelAndView;
	}
	
	@PostMapping("/addHoteles")
	public ModelAndView addHoteles(ModelAndView modelAndView, @RequestParam Map<String,String> datos) {
		Hoteles hotel = new Hoteles();
		
		hotel.setHo_nombre(datos.get("nombre"));
		hotel.setHo_zona(datos.get("zona"));
		hotel.setHo_direccion(datos.get("dir"));
		hotel.setHo_categoria(datos.get("categoria"));

		
		adminService.addHoteles(hotel);
		modelAndView.setViewName("redirect:/admin/listaHoteles");
		return modelAndView;
	}
	
	@PostMapping("/updateHoteles")
	public ModelAndView updateHoteles(ModelAndView modelAndView, @RequestParam Map<String,String> datos) {
		Hoteles hotel = new Hoteles();
		
		hotel.setHo_id(Integer.parseInt(datos.get("id")));
		hotel.setHo_nombre(datos.get("nombre"));
		hotel.setHo_zona(datos.get("zona"));
		hotel.setHo_direccion(datos.get("dir"));
		hotel.setHo_categoria(datos.get("categoria"));
		
		adminService.updateHoteles(hotel);
		modelAndView.setViewName("redirect:/admin/listaHoteles");
		return modelAndView;
	}
	
	@Value("${user}")
	private String userp;
	
	@Value("${pass}")
	private String passp;
	
	@PostMapping("/login")
	public ModelAndView loginAdmin(ModelAndView modelAndView, @RequestParam Map<String, String> datos,
			HttpServletRequest request) {
		
		HttpSession session = request.getSession();
		
		String user = datos.get("email");
		String pass = datos.get("pass");
         
		if (userp.equals(user) && passp.equals(pass)) {
			session.setAttribute("adminLogin", true);
			modelAndView.setViewName("redirect:/");
		} else {
			session.setAttribute("adminLogin", false);

			modelAndView.setViewName("redirect:/admin");
		}
		return modelAndView;


	}

	
}
