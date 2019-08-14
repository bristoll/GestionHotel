package com.cap.apigestionhotel.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.cap.apigestionhotel.dao.entity.Clientes;


@Mapper
public interface ClientesMapper {

	@Select("SELECT * FROM clientes where cli_email = #{cli_email}")
	Clientes login(String cli_email);
	
	@Select("SELECT * FROM clientes")
	List<Clientes> findAll();
	
	@Select("SELECT * FROM clientes where cli_dni = #{cli_dni}")
	Clientes findCliente(String cli_dni);
	
	@Insert("INSERT INTO clientes (cli_dni, cli_nombre, cli_apellido, cli_email, cli_direccion, cli_codigopos, cli_ciudad, password) VALUES (#{cli_dni}, #{cli_nombre}, #{cli_apellido}, #{cli_email}, #{cli_direccion}, #{cli_codigopos}, #{cli_ciudad}, #{password})")
	void insert(Clientes cliente);
	
	@Update("UPDATE clientes SET cli_nombre = #{cli_nombre}, cli_apellido = #{cli_apellido}, cli_email = #{cli_email}, cli_direccion = #{cli_direccion}, cli_codigopos = #{cli_codigopos}, cli_ciudad = #{cli_ciudad}, password = #{password} WHERE cli_dni = #{cli_dni}")
	void update(Clientes cliente);
	
	@Update("DELETE from clientes where cli_dni=#{cli_dni}")
	void delete(String cli_dni);
}
