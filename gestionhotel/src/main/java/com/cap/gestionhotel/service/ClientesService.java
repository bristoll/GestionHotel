package com.cap.gestionhotel.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cap.gestionhotel.model.ClienteLoginDto;
import com.cap.gestionhotel.model.ClienteSimpleDto;
import com.cap.gestionhotel.model.Clientes;
import com.cap.gestionhotel.model.HotelBusquedaDto;

@Service
public class ClientesService {

	@Autowired
	RestTemplate restTemplate;

	public List<Clientes> listaClientes() {
		ResponseEntity<List<Clientes>> responseEntity = restTemplate.exchange("http://localhost:8086/rest/clientes",
				HttpMethod.GET, null, new ParameterizedTypeReference<List<Clientes>>() {
				});
		return responseEntity.getBody();
	}

	public Clientes buscarCliente(String dni) {
		ResponseEntity<Clientes> responseEntity = restTemplate.exchange("http://localhost:8086/rest/clientes/" + dni,
				HttpMethod.GET, null, new ParameterizedTypeReference<Clientes>() {
				});
		return responseEntity.getBody();
	}

	public ResponseEntity<ClienteSimpleDto> login(ClienteLoginDto clienteLoginDto) {

		ResponseEntity<ClienteSimpleDto> responseEntity = restTemplate
				.postForEntity("http://localhost:8086/rest/clientes/login", clienteLoginDto, ClienteSimpleDto.class);

		return responseEntity;
	}
	
	public List<String> listaLibres(int numPer) {
		ResponseEntity<Map<Integer, List<HotelBusquedaDto>>> responseEntity = restTemplate.exchange("http://localhost:8086/rest/hotelesHabitacionLibre/"+numPer,
				HttpMethod.GET, null, new ParameterizedTypeReference<Map<Integer, List<HotelBusquedaDto>>>() {
				});
		Map<Integer, List<HotelBusquedaDto>> respuesta=responseEntity.getBody();
			 Set<Integer> keys=respuesta.keySet();
			 List<String> nombreHotel = new ArrayList<String>();
					 for (Integer key : keys) {
						nombreHotel.add(respuesta.get(key).get(0).getHo_nombre());
					}
		return nombreHotel;
	}

}
