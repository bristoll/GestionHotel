package com.cap.apigestionhotel.dao;

import java.util.List;

import com.cap.apigestionhotel.dao.entity.Clientes;
import com.cap.apigestionhotel.dao.entity.Productos;

public interface ProductosDao {
	
	public List<Productos> findAll();

}
