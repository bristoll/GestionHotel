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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cap.apigestionhotel.dao.entity.Hoteles;
import com.cap.apigestionhotel.impl.HotelesImpl;
import com.cap.apigestionhotel.service.HotelesService;

@RestController
@RequestMapping("/rest")
public class HotelesController {

	@Autowired
	HotelesService hotelesService;

	@GetMapping("/hoteles")
	public ResponseEntity<List<Hoteles>> findAll() {
		return hotelesService.findAll();
	}

	@GetMapping("/hoteles/{ho_id}")
	public ResponseEntity<Hoteles> findHotel(@PathVariable int ho_id) {
		return hotelesService.findHotel(ho_id);
	}
	
	@PostMapping("/hoteles")
	public ResponseEntity<Hoteles> insert(@ModelAttribute Hoteles hotel) {
		return hotelesService.insert(hotel);
	}

	@PutMapping("/hoteles/update")
	public ResponseEntity<Hoteles> update(@RequestBody Hoteles hotel) {
		return hotelesService.update(hotel);
	}

	@DeleteMapping("/hoteles/{ho_id}")
	public ResponseEntity<Hoteles> delete(@PathVariable int ho_id) {
		return hotelesService.delete(ho_id);
	}

}
