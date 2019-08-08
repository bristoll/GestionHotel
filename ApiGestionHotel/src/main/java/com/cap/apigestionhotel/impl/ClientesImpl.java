package com.cap.apigestionhotel.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.cap.apigestionhotel.dao.ClientesDao;
import com.cap.apigestionhotel.dao.entity.Clientes;
import com.cap.apigestionhotel.dao.mapper.ClientesMapper;

@Component
public class ClientesImpl implements ClientesDao {

	private final ClientesMapper clientesMapper;
	
	public ClientesImpl(ClientesMapper clientesMapper) {
		this.clientesMapper = clientesMapper;
	}

	@Override
	public Clientes login(String cli_email) {		
		return clientesMapper.login(cli_email);
	}
	
	
	@Override
	public List<Clientes> findAll() {		
		return clientesMapper.findAll();
	}

	@Override
	public Clientes findCliente(String cli_dni) {		
		return clientesMapper.findCliente(cli_dni);
	}

	@Override
	public void insert(Clientes cliente) {
		clientesMapper.insert(cliente);
		
	}

	@Override
	public void update(Clientes cliente) {
		clientesMapper.update(cliente);
	}

	@Override
	public void delete(String cli_dni) {
		clientesMapper.delete(cli_dni);
		
	}

}
