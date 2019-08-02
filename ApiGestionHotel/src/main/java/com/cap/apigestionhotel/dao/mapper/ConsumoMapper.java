package com.cap.apigestionhotel.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.cap.apigestionhotel.dao.entity.Consumo;

@Mapper
public interface ConsumoMapper {

	@Select("SELECT * FROM consumo")
	List<Consumo> findAll();
	
}
