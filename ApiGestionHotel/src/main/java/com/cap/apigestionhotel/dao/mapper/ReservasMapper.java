package com.cap.apigestionhotel.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.cap.apigestionhotel.dao.entity.Reservas;


@Mapper
public interface ReservasMapper {

	@Select("SELECT * FROM clientes")
	List<Reservas> findAll();
	
	@Select("SELECT * FROM clientes where re_id = #{re_id}")
	Reservas findReserva(String re_id);

}
