package com.cap.apigestionhotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cap.apigestionhotel.dao.entity.Clientes;
import com.cap.apigestionhotel.dao.entity.Consumo;
import com.cap.apigestionhotel.impl.ClientesImpl;
import com.cap.apigestionhotel.impl.ConsumoImpl;

@RestController
@RequestMapping("/rest")
public class ConsumoController {

	@Autowired
	ConsumoImpl consumoImpl;
	
	@GetMapping("/consumo")
    public ResponseEntity<List<Consumo>> findAll() {
		return new ResponseEntity<>(consumoImpl.findAll(), HttpStatus.OK);
    }
	
}
