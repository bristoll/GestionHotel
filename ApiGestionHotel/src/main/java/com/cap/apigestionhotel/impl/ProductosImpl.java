package com.cap.apigestionhotel.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.cap.apigestionhotel.dao.ProductosDao;
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
		// TODO Auto-generated method stub
		return null;
	}

	public void insert(Productos producto) {
		// TODO Auto-generated method stub
		
	}

	public void update(int pro_id, String pro_nombre, String pro_unidad_medida, float pro_precio_venta) {
		// TODO Auto-generated method stub
		
	}

	public void delete(int pro_id) {
		// TODO Auto-generated method stub
		
	}

}
