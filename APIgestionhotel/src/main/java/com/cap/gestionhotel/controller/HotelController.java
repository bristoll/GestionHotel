package com.cap.gestionhotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cap.gestionhotel.dao.entitys.Hotel;
import com.cap.gestionhotel.dao.impl.HotelImpl;

@RestController
@RequestMapping("/rest")
public class HotelController {
	@Autowired
	HotelImpl hotelImpl;
	
	@GetMapping()
	public ResponseEntity<List<Hotel>> getAll() {	
		return new ResponseEntity<List<Hotel>>(hotelImpl.getAll(), HttpStatus.OK);
	}
	

}
