package com.cap.apigestionhotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cap.apigestionhotel.dao.entity.Clientes;
import com.cap.apigestionhotel.impl.ClientesImpl;


@RestController
@RequestMapping("/rest")
public class ClientesController {

	@Autowired
	ClientesImpl clientesImpl;
	
	@GetMapping("/clientes")
    public ResponseEntity<List<Clientes>> findAll() {
		return new ResponseEntity<>(clientesImpl.findAll(), HttpStatus.OK);
    }
	
	//Para obtener cliente especifico mediante Id
	@GetMapping("/clientes/{cli_dni}")
    public ResponseEntity<Clientes> findCliente(@PathVariable String cli_dni) {
		return new ResponseEntity<>(clientesImpl.findCliente(cli_dni), HttpStatus.OK);
    }
	@PostMapping("/clientes")
    public ResponseEntity<Clientes> insert(String cli_dni, String cli_nombre, String cli_apellido, String cli_ciudad, String cli_direccion, String cli_email, int cli_codigopos, int password) {

        Clientes cliente = new Clientes();
        cliente.setCli_apellido(cli_apellido);
        cliente.setCli_ciudad(cli_ciudad);
        cliente.setCli_codigopos(cli_codigopos);
        cliente.setCli_direccion(cli_direccion);
        cliente.setCli_dni(cli_dni);
        cliente.setCli_email(cli_email);
        cliente.setCli_nombre(cli_nombre);
        cliente.setPassword(password);
        
        clientesImpl.insert(cliente);

        return new ResponseEntity<Clientes>(HttpStatus.CREATED);//La cadena es opcional
    }
	
	@PutMapping("/clientes/{idClientes}")
	public ResponseEntity<Clientes> update(String nombre,@PathVariable("idClientes") String idClientes) {//No se si es correcto meterle el nombre aqui ya que no aparece en la uri
		clientesImpl.update(nombre, idClientes);
		return new ResponseEntity<Clientes>(HttpStatus.OK);
	}
	
	@DeleteMapping("/clientes/{idClientes}")
	public ResponseEntity<Clientes> delete(@PathVariable("idClientes") String idClientes) {
		clientesImpl.delete(idClientes);
		return new ResponseEntity<Clientes>(HttpStatus.OK);
	}
	
}
