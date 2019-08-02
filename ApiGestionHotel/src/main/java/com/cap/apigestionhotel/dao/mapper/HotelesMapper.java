package com.cap.apigestionhotel.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.cap.apigestionhotel.dao.entity.Hoteles;

@Mapper
public interface HotelesMapper {

	@Select("SELECT * FROM hoteles")
	List<Hoteles> findAll();
	
}
