package com.cap.apigestionhotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cap.apigestionhotel.dao.entity.Productos;
import com.cap.apigestionhotel.impl.ProductosImpl;

@RestController
@RequestMapping("/rest")
public class ProductosController {

	@Autowired
	ProductosImpl productosImpl;
	
	@GetMapping("/productos")
    public ResponseEntity<List<Productos>> findAll() {
		return new ResponseEntity<>(productosImpl.findAll(), HttpStatus.OK);
    }
	
}
