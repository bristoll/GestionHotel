package com.cap.apigestionhotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cap.apigestionhotel.dao.entity.Clientes;
import com.cap.apigestionhotel.impl.ClientesImpl;

@RestController
@RequestMapping("/rest")
public class ClientesController {

	@Autowired
	ClientesImpl clientesImpl;
	
	@GetMapping("/clientes")
    public ResponseEntity<List<Clientes>> findAll() {
		return new ResponseEntity<>(clientesImpl.findAll(), HttpStatus.OK);
    }
	
	@GetMapping("/clientes/{cli_dni}")
    public ResponseEntity<Clientes> findCliente(@PathVariable String cli_dni) {
		return new ResponseEntity<>(clientesImpl.findCliente(cli_dni), HttpStatus.OK);
    }
	
}
