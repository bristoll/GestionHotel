package com.cap.apigestionhotel.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.cap.apigestionhotel.dao.ProductosDao;
import com.cap.apigestionhotel.dao.entity.Clientes;
import com.cap.apigestionhotel.dao.entity.Productos;
import com.cap.apigestionhotel.dao.mapper.ProductosMapper;

@Component
public class ProductosImpl implements ProductosDao {

	private final ProductosMapper productosMapper;
	
	public ProductosImpl(ProductosMapper productosMapper) {
		this.productosMapper = productosMapper;
	}

	@Override
	public List<Productos> findAll() {		
		return productosMapper.findAll();
	}

	public Productos findProductos(int pro_id) {
		return productosMapper.findProductos(pro_id);
	}

	public void insert(Productos producto) {
		productosMapper.insert(producto);	
	}

	public void update(Productos producto) {
		productosMapper.update(producto);	
	}

	public void delete(int pro_id) {
		productosMapper.delete(pro_id);	
	}


}
