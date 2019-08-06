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



@RestController
@RequestMapping("/rest")
public class ReservasController {

	@Autowired
	ReservasImpl reservasImpl;
	
	@GetMapping("/reservas")
    public ResponseEntity<List<Reservas>> findAll() {
		return new ResponseEntity<>(reservasImpl.findAll(), HttpStatus.OK);
    }
	
	//Para obtener cliente especifico mediante Id
	@GetMapping("/reservas/{re_id}")
    public ResponseEntity<Reservas> findReserva(@ModelAttribute Reservas reserva) {
		return new ResponseEntity<>(reservasImpl.findReserva(reserva.getRe_id()), HttpStatus.OK);
    }
	
	@GetMapping("/reservas/{re_id}")
    public ResponseEntity<Reservas> findCliente(@PathVariable int re_id) {
		return new ResponseEntity<>(reservasImpl.findReserva(re_id), HttpStatus.OK);
    }
	@PostMapping("/reservas")
    public ResponseEntity<Reservas> insert(@ModelAttribute Reservas reserva) {        
        reservasImpl.insert(reserva);
        return new ResponseEntity<Reservas>(HttpStatus.CREATED);//La cadena es opcional
    }
	
	@PutMapping("/reservas/{re_id}")
	public ResponseEntity<Reservas> update(@ModelAttribute Reservas reserva) {//No se si es correcto meterle el nombre aqui ya que no aparece en la uri
		reservasImpl.update(reserva);
		return new ResponseEntity<Reservas>(HttpStatus.OK);
	}
	
	@DeleteMapping("/reservas/{re_id}")
	public ResponseEntity<Reservas> delete(@ModelAttribute com.cap.apigestionhotel.dao.entity.Reservas reserva) {
		reservasImpl.delete(reserva.getRe_id());
		return new ResponseEntity<Reservas>(HttpStatus.OK);
	}
}
