package com.cap.apigestionhotel.dao;

import java.util.List;

import com.cap.apigestionhotel.dao.entity.Clientes;
import com.cap.apigestionhotel.dao.entity.Productos;
import com.cap.apigestionhotel.dao.entity.Productos;

public interface ProductosDao {
	
	public List<Productos> findAll();
	
	public Productos findProductos(int pro_id);
	public void insert(Productos producto);
	public void update(Productos producto);
	public void delete(int pro_id);

}
