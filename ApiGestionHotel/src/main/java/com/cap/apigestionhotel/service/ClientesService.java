package com.cap.apigestionhotel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import com.cap.apigestionhotel.dao.entity.Clientes;
import com.cap.apigestionhotel.dto.ClienteSimpleDto;
import com.cap.apigestionhotel.impl.ClientesImpl;

@Service
public class ClientesService {

	@Autowired
	ClientesImpl clientesImpl;
	
	 public ResponseEntity<Clientes> login(String cli_email) {
		return new ResponseEntity<>(clientesImpl.login(cli_email), HttpStatus.OK);
   }
	
	public ResponseEntity<List<Clientes>> findAll() {
		return new ResponseEntity<>(clientesImpl.findAll(), HttpStatus.OK);
    }
	
    public ResponseEntity<Clientes> findCliente(String cli_dni) {
		return new ResponseEntity<>(clientesImpl.findCliente(cli_dni), HttpStatus.OK);
    }
    
    public ResponseEntity<Clientes> insert(Clientes cliente) {        
        clientesImpl.insert(cliente);
        return new ResponseEntity<Clientes>(HttpStatus.CREATED);//La cadena es opcional
    }
    
	public ResponseEntity<Clientes> update(Clientes cliente) {//No se si es correcto meterle el nombre aqui ya que no aparece en la uri
		clientesImpl.update(cliente);
		return new ResponseEntity<Clientes>(HttpStatus.OK);
	}
	
	public ResponseEntity<Clientes> delete(Clientes cliente) {
		clientesImpl.delete(cliente.getCli_dni());
		return new ResponseEntity<Clientes>(HttpStatus.OK);
	}
	
    public ResponseEntity<ClienteSimpleDto> findClienteSimple(String cli_dni) {
		
		Clientes cliente = clientesImpl.findCliente(cli_dni);
		String nombreCompleto = cliente.getCli_nombre() + " " + cliente.getCli_apellido();
		
		return new ResponseEntity<>(new ClienteSimpleDto(cliente.getCli_dni(), nombreCompleto, cliente.getCli_email(), cliente.getCli_ciudad()), HttpStatus.OK);
    }
	
}
