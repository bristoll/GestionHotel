package com.cap.apigestionhotel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cap.apigestionhotel.dao.entity.Reservas;
import com.cap.apigestionhotel.impl.ReservasImpl;

@Service
public class ReservasService {

	@Autowired
	ReservasImpl reservasImpl;
	
	public ResponseEntity<List<Reservas>> findAll() {
		return new ResponseEntity<>(reservasImpl.findAll(), HttpStatus.OK);
    }
	
	public ResponseEntity<Reservas> findReserva(int re_id) {
		return new ResponseEntity<>(reservasImpl.findReserva(re_id), HttpStatus.OK);
    }
	
	public ResponseEntity<Reservas> insert(Reservas reserva) {        
        reservasImpl.insert(reserva);
        return new ResponseEntity<Reservas>(HttpStatus.CREATED);
    }
	
	public ResponseEntity<Reservas> update(Reservas reserva) {
		reservasImpl.update(reserva);
		return new ResponseEntity<Reservas>(HttpStatus.OK);
	}
	
	public ResponseEntity<Reservas> delete(int re_id) {
		reservasImpl.delete(re_id);
		return new ResponseEntity<Reservas>(HttpStatus.OK);
	}
}
