package com.cap.apigestionhotel.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.cap.apigestionhotel.dao.entity.Pago;

@Mapper
public interface PagoMapper {
	
	@Select("SELECT * FROM pago")
	List<Pago> findAll();
	

}
