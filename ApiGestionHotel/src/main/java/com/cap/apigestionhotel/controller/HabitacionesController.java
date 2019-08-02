package com.cap.apigestionhotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
	
}
