package com.cap.apigestionhotel.controller;

import java.sql.Date;
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

import com.cap.apigestionhotel.dao.entity.Pago;
import com.cap.apigestionhotel.dao.entity.Productos;
import com.cap.apigestionhotel.dao.entity.Hoteles;
import com.cap.apigestionhotel.dao.entity.Pago;
import com.cap.apigestionhotel.impl.HotelesImpl;
import com.cap.apigestionhotel.impl.PagoImpl;
import com.cap.apigestionhotel.service.PagoService;

@RestController
@RequestMapping("/rest")
public class PagoController {

	@Autowired
	PagoService pagoService;
	
	@GetMapping("/pago")
    public ResponseEntity<List<Pago>> findAll() {
		return pagoService.findAll();
    }
	
	//Para obtener un pago especifico mediante Id
		@GetMapping("/pago/{pag_id}")
	    public ResponseEntity<Pago> findPago(@PathVariable int pag_id) {
			return pagoService.findPago(pag_id);
	    }
		
		
		@PostMapping("/pago")
	    public ResponseEntity<Pago> insert(@ModelAttribute Pago pago) {
			pagoService.insert(pago);
	        return new ResponseEntity<Pago>(HttpStatus.CREATED);//La cadena es opcional
	    }
		
		@PutMapping("/pago/{pag_id}")
		public ResponseEntity<Pago> update(@ModelAttribute Pago pago) {
			pagoService.update(pago);
			return new ResponseEntity<Pago>(HttpStatus.OK);
		}
		
		@DeleteMapping("/pago/{pag_id}")
		public ResponseEntity<Pago> delete(@PathVariable int pag_id) {
			pagoService.delete(pag_id);
			return new ResponseEntity<Pago>(HttpStatus.OK);
		}
	
}
