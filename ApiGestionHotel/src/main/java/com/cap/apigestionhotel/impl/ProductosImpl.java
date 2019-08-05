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
		return productosMapper.findProductos(pro_id);
	}

	public void insert(Productos producto) {
		productosMapper.insert(producto);	
	}

	public void update(int pro_id, String pro_nombre, String pro_unidad_medida, float pro_precio_venta) {
		productosMapper.update( pro_id,  pro_nombre,  pro_unidad_medida,  pro_precio_venta);	
	}

	public void delete(int pro_id) {
		productosMapper.delete(pro_id);	
	}

}
