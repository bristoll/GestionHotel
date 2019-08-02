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

}
