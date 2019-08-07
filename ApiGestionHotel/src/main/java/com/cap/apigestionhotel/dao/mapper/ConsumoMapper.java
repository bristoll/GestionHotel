package com.cap.apigestionhotel.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.cap.apigestionhotel.dao.entity.Clientes;
import com.cap.apigestionhotel.dao.entity.Consumo;

@Mapper
public interface ConsumoMapper {

	@Select("SELECT * FROM consumo")
	List<Consumo> findAll();
	
	@Select("SELECT * FROM clientes where cli_dni = #{cli_dni}")
	Consumo findConsumo(int con_id);
	
	@Insert("INSERT INTO consumo ( con_pro_id, con_cantidad, con_precio_venta, con_estado) VALUES ( #{con_pro_id}, #{con_cantidad}, #{con_precio_venta}, #{con_estado})")
    void insert(Consumo consumo);
	
	@Update("UPDATE consumo SET con_re_id = #{con_re_id}, con_pro_id = #{con_pro_id}, con_cantidad = #{con_cantidad}, con_precio_venta = #{con_precio_venta}, con_estado = #{con_estado}")
	void update(Consumo consumo);
	
	@Update("DELETE from clientes where cli_dni=#{cli_dni}")
	void delete(int con_id);
	
}
