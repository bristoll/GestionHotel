package com.cap.apigestionhotel.controller;

import java.sql.Date;
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

import com.cap.apigestionhotel.dao.entity.Pago;
import com.cap.apigestionhotel.dao.entity.Productos;
import com.cap.apigestionhotel.impl.ProductosImpl;

@RestController
@RequestMapping("/rest")
public class ProductosController {

	@Autowired
	ProductosImpl productosImpl;
	
	@GetMapping("/productos")
    public ResponseEntity<List<Productos>> findAll() {
		return new ResponseEntity<>(productosImpl.findAll(), HttpStatus.OK);
    }
	
	
	//Para obtener un producto especifico mediante Id
	@GetMapping("/productos/{pro_id}")
    public ResponseEntity<Productos> findProductos(@PathVariable int pro_id) {
		return new ResponseEntity<Productos>(productosImpl.findProductos(pro_id), HttpStatus.OK);
    }
	
	
	@PostMapping("/productos")
    public ResponseEntity<Productos> insert(int pro_id, String pro_nombre, String pro_unidad_medida, float pro_precio_venta) {

        Productos producto = new Productos();
        producto.setPro_id(pro_id);
        producto.setPro_nombre(pro_nombre);
        producto.setPro_unidad_medida(pro_unidad_medida);
        producto.setPro_precio_venta(pro_precio_venta);
        
        productosImpl.insert(producto);

        return new ResponseEntity<Productos>(HttpStatus.CREATED);//La cadena es opcional
    }
	
	@PutMapping("/productos/{pro_id}")
	public ResponseEntity<Productos> update(@PathVariable("pro_id") int pro_id, String pro_nombre, String pro_unidad_medida, float pro_precio_venta) {
		productosImpl.update(pro_id, pro_nombre, pro_unidad_medida, pro_precio_venta);
		return new ResponseEntity<Productos>(HttpStatus.OK);
	}
	
	@DeleteMapping("/productos/{pro_id}")
	public ResponseEntity<Productos> delete(@PathVariable("pro_id") int pro_id) {
		productosImpl.delete(pro_id);
		return new ResponseEntity<Productos>(HttpStatus.OK);
	}
	
}
