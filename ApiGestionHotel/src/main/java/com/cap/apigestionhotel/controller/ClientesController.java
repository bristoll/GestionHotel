package com.cap.apigestionhotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cap.apigestionhotel.dao.entity.Clientes;
import com.cap.apigestionhotel.dto.ClienteLoginDto;
import com.cap.apigestionhotel.dto.ClienteSimpleDto;
import com.cap.apigestionhotel.impl.ClientesImpl;
import com.cap.apigestionhotel.service.ClientesService;

@RestController
@RequestMapping("/rest")
public class ClientesController {

	@Autowired
	ClientesService clientesService;

	@PostMapping("/clientes/login")
	public ResponseEntity<ClienteSimpleDto> login(@RequestBody ClienteLoginDto clienteLoginDto) {
		Clientes cliente = clientesService.login(clienteLoginDto.getEmail());

		boolean isValid = false;
		if (cliente != null) {
			if (cliente.getPassword().equals(clienteLoginDto.getPass())) {
				isValid = true;
				ClienteSimpleDto clienteSimpleDto = new ClienteSimpleDto(cliente.getCli_dni(),
						cliente.getCli_nombre() + " " + cliente.getCli_apellido(), cliente.getCli_email(),
						cliente.getCli_ciudad());
				return new ResponseEntity<>(clienteSimpleDto, HttpStatus.OK);
			}
		}
		
		return new ResponseEntity<>(new ClienteSimpleDto(), HttpStatus.RESET_CONTENT);

	}

	@GetMapping("/clientes")
	public ResponseEntity<List<Clientes>> findAll() {
		return clientesService.findAll();
	}

	@GetMapping("/clientes/{cli_dni}")
	public ResponseEntity<Clientes> findCliente(@PathVariable String cli_dni) {
		return clientesService.findCliente(cli_dni);
	}

	@PostMapping("/clientes")
	public ResponseEntity<Clientes> insert(@RequestBody Clientes cliente) {
		return clientesService.insert(cliente);
	}

	@PutMapping("/clientes/{idClientes}")
	public ResponseEntity<Clientes> update(@ModelAttribute Clientes cliente) {
		return clientesService.update(cliente);
	}

	@DeleteMapping("/clientes/{cli_dni}")
	public ResponseEntity<Clientes> delete(@PathVariable String cli_dni) {
		return clientesService.delete(cli_dni);
	}

	@GetMapping("/clientes/simple/{cli_dni}")
	public ResponseEntity<ClienteSimpleDto> findClienteSimple(@PathVariable String cli_dni) {
		return clientesService.findClienteSimple(cli_dni);
	}

}
