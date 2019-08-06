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

@RestController
@RequestMapping("/rest")
public class HabitacionesController {

	@Autowired
	HabitacionesImpl habitacionesImpl;
	
	@GetMapping("/habitaciones")
    public ResponseEntity<List<Habitaciones>> findAll() {
		return new ResponseEntity<>(habitacionesImpl.findAll(), HttpStatus.OK);
    }
	
	@GetMapping("/clientes/{cli_dni}")
    public ResponseEntity<Habitaciones> findCliente(@PathVariable int ha_id) {
		return new ResponseEntity<>(habitacionesImpl.findHabitaciones(ha_id), HttpStatus.OK);
    }
	
	@PostMapping("/clientes")
    public ResponseEntity<Clientes> insert(@ModelAttribute Habitaciones habitacione) {        
		habitacionesImpl.insert(habitacione);
        return new ResponseEntity<Clientes>(HttpStatus.CREATED);
    }
	
	@PutMapping("/clientes/{idClientes}")
	public ResponseEntity<Clientes> update(@ModelAttribute Habitaciones habitacione) {
		habitacionesImpl.update(habitacione);
		return new ResponseEntity<Clientes>(HttpStatus.OK);
	}
	
	@DeleteMapping("/clientes/{idClientes}")
	public ResponseEntity<Clientes> delete(@ModelAttribute Habitaciones habitacione) {
		habitacionesImpl.delete(habitacione.getHa_id());
		return new ResponseEntity<Clientes>(HttpStatus.OK);
	}
}
