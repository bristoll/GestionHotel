package com.cap.apigestionhotel.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.cap.apigestionhotel.dao.entity.Habitaciones;

@Mapper
public interface HabitacionesMapper {

	@Select("SELECT * FROM habitaciones")
	List<Habitaciones> findAll();
	
}
