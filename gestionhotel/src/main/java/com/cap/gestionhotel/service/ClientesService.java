package com.cap.gestionhotel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cap.gestionhotel.model.Clientes;
import com.cap.gestionhotel.repository.ClientesRepo;

@Service
public class ClientesService {

	@Autowired
	ClientesRepo clientesRepo;
	
	public List<Clientes> listaClientes() {
		return clientesRepo.listaClientes();
	}

}
