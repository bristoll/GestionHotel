package com.cap.gestionhotel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cap.gestionhotel.model.Clientes;
import com.cap.gestionhotel.model.Hoteles;

@Service
public class AdminService {

	@Autowired
	RestTemplate restTemplate;

	public List<Clientes> listaClientes() {
		ResponseEntity<List<Clientes>> responseEntity = restTemplate.exchange("http://localhost:8086/rest/clientes",
				HttpMethod.GET, null, new ParameterizedTypeReference<List<Clientes>>() {
				});
		return responseEntity.getBody();
	}

	public void deleteClientes(String id) {
		restTemplate.delete("http://localhost:8086/rest/clientes/" + id);
	}

	public void updateClientes(Clientes cliente) {
		restTemplate.put("http://localhost:8086/rest/clientes/update", cliente, Clientes.class);
	}

	public void addClientes(Clientes cliente) {
		restTemplate.postForEntity("http://localhost:8086/rest/clientes", cliente, Clientes.class);
	}

	public void deleteHoteles(int ho_id) {
		restTemplate.delete("http://localhost:8086/rest/hoteles/" + ho_id);		
	}

	public List<Hoteles> listaHoteles() {
		ResponseEntity<List<Hoteles>> responseEntity = restTemplate.exchange("http://localhost:8086/rest/hoteles",
				HttpMethod.GET, null, new ParameterizedTypeReference<List<Hoteles>>() {
				});
		return responseEntity.getBody();
	}

	
	public void updateHoteles(Hoteles hotel) {
		restTemplate.put("http://localhost:8086/rest/hoteles/update", hotel, Hoteles.class);
	}

	public void addHoteles(Hoteles hotel) {
		restTemplate.postForEntity("http://localhost:8086/rest/hoteles", hotel, Hoteles.class);
	}
}
