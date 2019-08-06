package com.cap.apigestionhotel.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.cap.apigestionhotel.dao.entity.Clientes;
import com.cap.apigestionhotel.dao.entity.Habitaciones;
import com.cap.apigestionhotel.dao.entity.Hoteles;

@Mapper
public interface HotelesMapper {

	@Select("SELECT * FROM hoteles")
	List<Hoteles> findAll();
	
	@Select("SELECT * FROM hoteles where ho_id = #{ho_id}")
	Clientes findCliente(int ho_id);
	
	@Insert("INSERT INTO hoteles (ho_id, ho_nombre, ho_categoria, ho_zona, ho_direccion) "
			+ "VALUES (#{ho_id}, #{ho_nombre}, #{ho_categoria}, #{ho_zona}, #{ho_direccion}")
    void insert(Hoteles hotel);
	
	@Update("UPDATE hoteles SET ho_nombre = #{ho_nombre}, ho_categoria = #{ho_categoria}, ho_zona = #{ho_zona}, ho_direccion = #{ho_direccion} where ho_id=#{ho_id}")
	void update(Hoteles hotel);
	
	@Update("DELETE from hoteles where ho_id=#{ho_id}")
	void delete(int ho_id);
	
}
