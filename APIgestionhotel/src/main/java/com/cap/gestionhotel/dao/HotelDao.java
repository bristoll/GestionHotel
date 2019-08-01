package com.cap.gestionhotel.dao;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.cap.gestionhotel.dao.entitys.Hotel;

public interface HotelDao {

	public List<Hotel> getAll();
	
}
