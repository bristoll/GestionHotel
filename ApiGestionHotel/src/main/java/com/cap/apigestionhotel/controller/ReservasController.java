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

import com.cap.apigestionhotel.dao.entity.Reservas;
import com.cap.apigestionhotel.impl.ReservasImpl;
import com.cap.apigestionhotel.service.ReservasService;



@RestController
@RequestMapping("/rest")
public class ReservasController {

	@Autowired
	ReservasService reservasService;
	
	@GetMapping("/reservas")
    public ResponseEntity<List<Reservas>> findAll() {
		return reservasService.findAll();
    }
	

	
	@GetMapping("/reservas/{re_id}")
    public ResponseEntity<Reservas> findCliente(@PathVariable int re_id) {
		return reservasService.findReserva(re_id);
    }
	@PostMapping("/reservas")
    public ResponseEntity<Reservas> insert(@ModelAttribute Reservas reserva) {        
        
        return reservasService.insert(reserva);
    }
	
	@PutMapping("/reservas/{re_id}")
	public ResponseEntity<Reservas> update(@ModelAttribute Reservas reserva) {//No se si es correcto meterle el nombre aqui ya que no aparece en la uri
		
		return reservasService.update(reserva);
	}
	
	@DeleteMapping("/reservas/{re_id}")
	public ResponseEntity<Reservas> delete(@PathVariable int re_id) {
	
		return reservasService.delete(re_id);
	}
}
