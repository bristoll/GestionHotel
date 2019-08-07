package com.cap.apigestionhotel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.cap.apigestionhotel.dao.entity.Pago;
import com.cap.apigestionhotel.impl.PagoImpl;

@Service
public class PagoService {

	@Autowired
	PagoImpl pagoImpl;
	
	public ResponseEntity<List<Pago>> findAll() {
		return new ResponseEntity<>(pagoImpl.findAll(), HttpStatus.OK);
    }
	
    public ResponseEntity<Pago> findPago(int pag_id) {
		return new ResponseEntity<>(pagoImpl.findPago(pag_id), HttpStatus.OK);
    }
    
    public ResponseEntity<Pago> insert(Pago pago) {        
        pagoImpl.insert(pago);
        return new ResponseEntity<Pago>(HttpStatus.CREATED);//La cadena es opcional
    }
    
	public ResponseEntity<Pago> update(Pago pago) {//No se si es correcto meterle el nombre aqui ya que no aparece en la uri
		pagoImpl.update(pago);
		return new ResponseEntity<Pago>(HttpStatus.OK);
	}
	
	public ResponseEntity<Pago> delete(Pago pago) {
		pagoImpl.delete(pago.getPag_id());
		return new ResponseEntity<Pago>(HttpStatus.OK);
	}
	
//    public ResponseEntity<ClienteSimpleDto> findClienteSimple(String cli_dni) {
//		
//		Pago cliente = pagoImpl.findCliente(cli_dni);
//		String nombreCompleto = cliente.getCli_nombre() + " " + cliente.getCli_apellido();
//		
//		return new ResponseEntity<>(new ClienteSimpleDto(cliente.getCli_dni(), nombreCompleto, cliente.getCli_email(), cliente.getCli_ciudad()), HttpStatus.OK);
//    }
	
}
