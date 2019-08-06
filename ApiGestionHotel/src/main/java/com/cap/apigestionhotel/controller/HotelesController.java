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

import com.cap.apigestionhotel.dao.entity.Hoteles;
import com.cap.apigestionhotel.impl.HotelesImpl;
import com.cap.apigestionhotel.service.HotelesService;

@RestController
@RequestMapping("/rest")
public class HotelesController {

//	@Autowired
//	HotelesImpl hotelesImpl;
//	
//	@GetMapping("/hoteles")
//    public ResponseEntity<List<Hoteles>> findAll() {
//		return new ResponseEntity<>(hotelesImpl.findAll(), HttpStatus.OK);
//    }
//	@GetMapping("/hoteles/{ho_id}")
//    public ResponseEntity<Hoteles> findCliente(@PathVariable int ho_id) {
//		return new ResponseEntity<>(hotelesImpl.findHotel(ho_id), HttpStatus.OK);
//    }
//	@PostMapping("/hoteles")
//    public ResponseEntity<Hoteles> insert(@ModelAttribute Hoteles hotel) {        
//        hotelesImpl.insert(hotel);
//        return new ResponseEntity<Hoteles>(HttpStatus.CREATED);//La cadena es opcional
//    }
//	
//	@PutMapping("/hoteles/{ho_id}")
//	public ResponseEntity<Hoteles> update(@ModelAttribute Hoteles hotel) {//No se si es correcto meterle el nombre aqui ya que no aparece en la uri
//		hotelesImpl.update(hotel);
//		return new ResponseEntity<Hoteles>(HttpStatus.OK);
//	}
//	
//	@DeleteMapping("/hoteles/{ho_id}")
//	public ResponseEntity<Hoteles> delete(@ModelAttribute Hoteles hotel) {
//		hotelesImpl.delete(hotel.getHo_id());
//		return new ResponseEntity<Hoteles>(HttpStatus.OK);
//	}

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

	@PutMapping("/hoteles/{ho_id}")
	public ResponseEntity<Hoteles> update(@ModelAttribute Hoteles hotel) {
		return hotelesService.update(hotel);
	}

	@DeleteMapping("/hoteles/{ho_id}")
	public ResponseEntity<Hoteles> delete(@ModelAttribute Hoteles hotel) {
		return hotelesService.delete(hotel);
	}

}
