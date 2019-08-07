package com.cap.apigestionhotel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import com.cap.apigestionhotel.dao.entity.Hoteles;
import com.cap.apigestionhotel.impl.HotelesImpl;

@Service
public class HotelesService {

	@Autowired
	HotelesImpl hotelesImpl;
	
	public ResponseEntity<List<Hoteles>> findAll() {
		return new ResponseEntity<>(hotelesImpl.findAll(), HttpStatus.OK);
    }
	
	public ResponseEntity<Hoteles> findHotel(int ho_id) {
		return new ResponseEntity<>(hotelesImpl.findHotel(ho_id), HttpStatus.OK);
    }
	
	public ResponseEntity<Hoteles> insert(Hoteles hotel) {        
        hotelesImpl.insert(hotel);
        return new ResponseEntity<Hoteles>(HttpStatus.CREATED);
    }
	
	public ResponseEntity<Hoteles> update(Hoteles hotel) {
		hotelesImpl.update(hotel);
		return new ResponseEntity<Hoteles>(HttpStatus.OK);
	}
	
	public ResponseEntity<Hoteles> delete(int ho_id) {
		hotelesImpl.delete(ho_id);
		return new ResponseEntity<Hoteles>(HttpStatus.OK);
	}
	
}
