package com.cap.apigestionhotel.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.cap.apigestionhotel.dao.entity.Clientes;


@Mapper
public interface ClientesMapper {

	@Select("SELECT * FROM clientes")
	List<Clientes> findAll();
	
	@Select("SELECT * FROM clientes where cli_dni = #{cli_dni}")
	Clientes findCliente(String cli_dni);
	
	
	@Update("UPDATE clientes SET nombre = #{nombre} where cli_dni=#{cli_dni}")
	void update(String nombre,String cli_dni);
	
	@Update("DELETE from clientes where cli_dni=#{cli_dni}")
	void delete(String cli_dni);
}
