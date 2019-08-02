package com.cap.apigestionhotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cap.apigestionhotel.dao.entity.Hoteles;
import com.cap.apigestionhotel.dao.entity.Pago;
import com.cap.apigestionhotel.impl.HotelesImpl;
import com.cap.apigestionhotel.impl.PagoImpl;

@RestController
@RequestMapping("/rest")
public class PagoController {

	@Autowired
	PagoImpl pagoImpl;
	
	@GetMapping("/pago")
    public ResponseEntity<List<Pago>> findAll() {
		return new ResponseEntity<>(pagoImpl.findAll(), HttpStatus.OK);
    }
	
}
