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

import com.cap.apigestionhotel.dao.entity.Consumo;
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
	@GetMapping("/consumo/{con_id}")
    public ResponseEntity<Consumo> findConsumo(@PathVariable int con_id) {
		return new ResponseEntity<>(consumoImpl.findConsumo(con_id), HttpStatus.OK);
    }
	@PostMapping("/consumo")
    public ResponseEntity<Consumo> insert(@ModelAttribute Consumo consumo) {        
        consumoImpl.insert(consumo);
        return new ResponseEntity<Consumo>(HttpStatus.CREATED);
    }
	
	@PutMapping("/consumo/{con_id}")
	public ResponseEntity<Consumo> update(@ModelAttribute Consumo consumo) {
		consumoImpl.update(consumo);
		return new ResponseEntity<Consumo>(HttpStatus.OK);
	}
	
	@DeleteMapping("/consumo/{con_id}")
	public ResponseEntity<Consumo> delete(@ModelAttribute com.cap.apigestionhotel.dao.entity.Consumo consumo) {
		consumoImpl.delete(consumo.getCon_id());
		return new ResponseEntity<Consumo>(HttpStatus.OK);
	}
	
}
