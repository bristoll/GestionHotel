package com.cap.apigestionhotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cap.apigestionhotel.dao.entity.Reservas;
import com.cap.apigestionhotel.impl.ReservasImpl;

@RestController
@RequestMapping("/rest")
public class ReservasController {

	@Autowired
	ReservasImpl reservasImpl;
	
	@GetMapping("/reservas")
    public ResponseEntity<List<Reservas>> findAll() {
		return new ResponseEntity<>(reservasImpl.findAll(), HttpStatus.OK);
    }
	
	//Para obtener cliente especifico mediante Id
	@GetMapping("/reservas/{re_id}")
    public ResponseEntity<Reservas> findCliente(@PathVariable String re_id) {
		return new ResponseEntity<>(reservasImpl.findReserva(re_id), HttpStatus.OK);
    }
}
