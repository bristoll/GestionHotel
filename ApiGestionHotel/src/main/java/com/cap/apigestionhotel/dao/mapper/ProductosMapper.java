package com.cap.apigestionhotel.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.cap.apigestionhotel.dao.entity.Productos;

@Mapper
public interface ProductosMapper {
	
	@Select("SELECT * FROM productos")
	List<Productos> findAll();
	

}
