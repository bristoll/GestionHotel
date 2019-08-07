package com.cap.apigestionhotel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import com.cap.apigestionhotel.dao.entity.Habitaciones;
import com.cap.apigestionhotel.impl.HabitacionesImpl;

@Service
public class HabitacionesService {

	@Autowired
	HabitacionesImpl habitacionesImpl;
	
	public ResponseEntity<List<Habitaciones>> findAll() {
		return new ResponseEntity<List<Habitaciones>>(habitacionesImpl.findAll(), HttpStatus.OK);
    }
	
	public ResponseEntity<Habitaciones> findHabitacion(int ha_id) {
		return new ResponseEntity<Habitaciones>(habitacionesImpl.findHabitacion(ha_id), HttpStatus.OK);
    }
	
	public ResponseEntity<Habitaciones> insert(Habitaciones habitacione) {        
		habitacionesImpl.insert(habitacione);
        return new ResponseEntity<Habitaciones>(HttpStatus.CREATED);
    }
	
	public ResponseEntity<Habitaciones> update(Habitaciones habitacion) {
		habitacionesImpl.update(habitacion);
		return new ResponseEntity<Habitaciones>(HttpStatus.OK);
	}
	
	public ResponseEntity<Habitaciones> delete(int ha_id) {
		habitacionesImpl.delete(ha_id);
		return new ResponseEntity<Habitaciones>(HttpStatus.OK);
	}
	
}
