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
import org.springframework.web.bind.annotation.RestController;

import com.cap.apigestionhotel.dao.entity.Clientes;
import com.cap.apigestionhotel.dao.entity.Pago;
import com.cap.apigestionhotel.dao.entity.Productos;
import com.cap.apigestionhotel.service.ProductosService;

@RestController
@RequestMapping("/rest")
public class ProductosController {

	@Autowired
	ProductosService productosService;
	
	@GetMapping("/productos")
    public ResponseEntity<List<Productos>> findAll() {
		return productosService.findAll();
    }
	
	
	@GetMapping("/productos/{pro_id}")
    public ResponseEntity<Productos> findProductos(@PathVariable int pro_id) {
		return productosService.findProductos(pro_id);
    }
	
	
	@PostMapping("/productos")
    public ResponseEntity<Productos> insert(@RequestBody Productos producto) {             
        return  productosService.insert(producto);
    }
	
	@PutMapping("/productos/{pro_id}")
	public ResponseEntity<Productos> update(@ModelAttribute Productos producto) {	
		return productosService.update(producto);
	}
	
	@DeleteMapping("/productos/{pro_id}")
	public ResponseEntity<Productos> delete(@PathVariable int pro_id) {
		return productosService.delete(pro_id);
	}

}
