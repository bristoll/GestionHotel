package com.cap.gestionhotel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cap.gestionhotel.model.Clientes;

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
	
	public void delete(String id) {
		restTemplate.delete("http://localhost:8086/rest/clientes/"+id);
	}
	
	public void update(String id) {
		restTemplate.delete("http://localhost:8086/rest/clientes/"+id);
	}
	
}
