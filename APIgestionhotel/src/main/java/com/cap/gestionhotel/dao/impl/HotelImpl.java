package com.cap.gestionhotel.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cap.gestionhotel.dao.HotelDao;
import com.cap.gestionhotel.dao.entitys.Hotel;
import com.cap.gestionhotel.dao.mapper.HotelMapper;


@RestController
@RequestMapping("/rest")
public class HotelImpl implements HotelDao {

	private HotelMapper hotelMapper;
	
	
	public HotelImpl(HotelMapper hotelMapper) {
		this.hotelMapper = hotelMapper;
	}

	@GetMapping("/hotel")
	@Override
	public ResponseEntity<List<Hotel>> getAll() {	
		return new ResponseEntity<List<Hotel>>(hotelMapper.findAll(), HttpStatus.OK);
	}

	
	
}
