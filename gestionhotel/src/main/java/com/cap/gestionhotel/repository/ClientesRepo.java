package com.cap.gestionhotel.repository;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.cap.gestionhotel.model.Clientes;

@Repository
public class ClientesRepo extends RestTemplate {

	public List<Clientes> listaClientes() {
		ResponseEntity<List<Clientes>> responseEntity = exchange("http://localhost:8086/rest/clientes", HttpMethod.GET, null,
				new ParameterizedTypeReference<List<Clientes>>() {
				});
		return responseEntity.getBody();
	}

}
