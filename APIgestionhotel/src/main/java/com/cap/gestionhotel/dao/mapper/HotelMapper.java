package com.cap.gestionhotel.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.cap.gestionhotel.dao.entitys.Hotel;

@Mapper
public interface HotelMapper {

	@Select("select * from hoteles")
	List<Hotel> findAll();
	
}
