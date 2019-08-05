package com.cap.apigestionhotel.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.cap.apigestionhotel.dao.entity.Clientes;
import com.cap.apigestionhotel.dao.entity.Habitaciones;

@Mapper
public interface HabitacionesMapper {

	@Select("SELECT * FROM habitaciones")
	List<Habitaciones> findAll();
	
	@Select("SELECT * FROM habitaciones where ha_id = #{ha_id}")
	Clientes findCliente(int ha_id);
	
	@Insert("INSERT INTO habitaciones (ha_id, ha_piso, ha_numero, ha_vista, ha_clase, ha_camas, ha_precio, ha_personas, ha_dis, ha_ho_id) VALUES (#{ha_id}, #{ha_piso}, #{ha_numero}, #{ha_vista}, #{ha_clase}, #{ha_camas}, #{ha_precio}, #{ha_personas}, #{ha_dis}, #{ha_ho_id})")
    void insert(Clientes cliente);
	
	@Update("UPDATE habitaciones SET ha_piso = #{ha_piso}, ha_numero = #{ha_numero}, ha_vista = #{ha_vista}, ha_clase = #{ha_clase}, ha_camas = #{ha_camas}, ha_precio = #{ha_precio}, ha_personas = #{ha_personas}, ha_dis = #{ha_dis}, ha_ho_id = #{ha_ho_id} where ha_id=#{ha_id}")
	void update(Habitaciones habitaciones);
	
	@Update("DELETE from habitaciones where ha_id=#{ha_id}")
	void delete(int ha_id);
	
}
