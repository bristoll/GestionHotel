package com.cap.apigestionhotel.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.cap.apigestionhotel.dao.entity.Productos;


public interface ProductosMapper {
	
	@Select("SELECT * FROM productos")
	List<Productos> findAll();
	

}
