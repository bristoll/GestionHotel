package com.cap.gestionhotel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


import com.cap.gestionhotel.model.Hoteles;

@Service
public class HotelesService {

	@Autowired
	RestTemplate restTemplate;

	public List<Hoteles> listaHoteles() {
		ResponseEntity<List<Hoteles>> responseEntity = restTemplate.exchange("http://localhost:8086/rest/hoteles",
				HttpMethod.GET, null, new ParameterizedTypeReference<List<Hoteles>>() {
				});
		return responseEntity.getBody();
	}

	public Hoteles buscarHotel(int ho_id) {
		ResponseEntity<Hoteles> responseEntity = restTemplate.exchange("http://localhost:8086/rest/hoteles/" + ho_id,
				HttpMethod.GET, null, new ParameterizedTypeReference<Hoteles>() {
				});
		return responseEntity.getBody();
	}



}
