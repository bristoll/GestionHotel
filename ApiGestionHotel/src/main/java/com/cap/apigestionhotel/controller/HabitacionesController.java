package com.cap.apigestionhotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cap.apigestionhotel.dao.entity.Clientes;
import com.cap.apigestionhotel.dao.entity.Habitaciones;
import com.cap.apigestionhotel.impl.HabitacionesImpl;
import com.cap.apigestionhotel.service.HabitacionesService;

@RestController
@RequestMapping("/rest")
public class HabitacionesController {

	@Autowired
	HabitacionesService habitacionesService;
	
	@GetMapping("/habitaciones")
    public ResponseEntity<List<Habitaciones>> findAll() {
		return habitacionesService.findAll();
    }
	
	@GetMapping("/habitaciones/{ha_id}")
    public ResponseEntity<Habitaciones> findHabitacion(@PathVariable int ha_id) {
		return habitacionesService.findHabitacion(ha_id);
    }
	
	@PostMapping("/habitaciones")
    public ResponseEntity<Habitaciones> insert(@ModelAttribute Habitaciones habitacione) {        
        return habitacionesService.insert(habitacione);
    }
	
	@PutMapping("/habitaciones/{ha_id}")
	public ResponseEntity<Habitaciones> update(@ModelAttribute Habitaciones habitacion) {
		return habitacionesService.update(habitacion);
	}
	
	@DeleteMapping("/habitaciones/{ha_id}")
	public ResponseEntity<Habitaciones> delete(@PathVariable int ha_id) {
		return habitacionesService.delete(ha_id);
	}
	
}
