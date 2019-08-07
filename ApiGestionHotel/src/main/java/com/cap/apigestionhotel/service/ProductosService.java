package com.cap.apigestionhotel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


import com.cap.apigestionhotel.dao.entity.Productos;
import com.cap.apigestionhotel.impl.ProductosImpl;

@Service
public class ProductosService {

	@Autowired
	ProductosImpl productosImpl;
	
	public ResponseEntity<List<Productos>> findAll() {
		return new ResponseEntity<>(productosImpl.findAll(), HttpStatus.OK);
    }
	
    public ResponseEntity<Productos> findProductos(int pro_id) {
		return new ResponseEntity<>(productosImpl.findProductos(pro_id), HttpStatus.OK);
    }
    
    public ResponseEntity<Productos> insert(Productos producto) {        
        productosImpl.insert(producto);
        return new ResponseEntity<Productos>(HttpStatus.CREATED);//La cadena es opcional
    }
    
	public ResponseEntity<Productos> update(Productos producto) {//No se si es correcto meterle el nombre aqui ya que no aparece en la uri
		productosImpl.update(producto);
		return new ResponseEntity<Productos>(HttpStatus.OK);
	}
	
	public ResponseEntity<Productos> delete(int pro_id) {
		productosImpl.delete(pro_id);
		return new ResponseEntity<Productos>(HttpStatus.OK);
	}
	

	
}
