package com.cap.apigestionhotel.dao;

import java.util.List;

import com.cap.apigestionhotel.dao.entity.Clientes;


public interface ClientesDao {

	public List<Clientes> findAll();
	
	public Clientes findCliente(String cli_dni);
	public void insert(Clientes cliente);
	public void update(Clientes cliente);
	public void delete(String cli_dni);
}
