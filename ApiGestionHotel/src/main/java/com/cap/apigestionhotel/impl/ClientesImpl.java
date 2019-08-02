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
	public List<Clientes> findAll() {		
		return clientesMapper.findAll();
	}

	@Override
	public Clientes findCliente(String cli_dni) {		
		return clientesMapper.findCliente(cli_dni);
	}

	public void insert(Clientes cliente) {
		clientesMapper.insert(cliente);
		
	}

	public void update(String nombre,String cli_dni) {
		clientesMapper.update(nombre, cli_dni);
	}

	public void delete(String idClientes) {
		clientesMapper.delete(idClientes);
		
	}

}
