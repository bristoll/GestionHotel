package com.cap.apigestionhotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cap.apigestionhotel.dao.entity.Hoteles;
import com.cap.apigestionhotel.impl.HotelesImpl;

@RestController
@RequestMapping("/rest")
public class HotelesController {

	@Autowired
	HotelesImpl hotelesImpl;
	
	@GetMapping("/hoteles")
    public ResponseEntity<List<Hoteles>> findAll() {
		return new ResponseEntity<>(hotelesImpl.findAll(), HttpStatus.OK);
    }
	
}
