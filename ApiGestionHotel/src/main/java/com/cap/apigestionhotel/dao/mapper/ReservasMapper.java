package com.cap.apigestionhotel.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.cap.apigestionhotel.dao.entity.Reservas;




@Mapper
public interface ReservasMapper {

	@Select("SELECT * FROM reservas")
	List<Reservas> findAll();
	
	@Select("SELECT * FROM reservas where re_id = #{re_id}")
	Reservas findReserva(int re_id);

	@Insert("INSERT INTO reservas ( re_cli_dni, re_ha_id, re_fecha_reserva, re_fecha_ini,re_fecha_fin,re_coste_alojamiento,re_estado) "
			+ "VALUES ( #{re_cli_dni}, #{re_ha_id}, #{re_fecha_reserva}, #{re_fecha_ini},#{re_fecha_fin},#{re_coste_alojamiento},#{re_estado}")
    void insert(Reservas reserva);
	
	@Update("UPDATE reservas SET re_cli_dni = #{re_cli_dni}, re_ha_id = #{re_ha_id}, re_fecha_reserva = #{re_fecha_reserva}, re_fecha_ini = #{re_fecha_ini}, re_fecha_fin = #{re_fecha_fin}, re_coste_alojamiento = #{re_coste_alojamiento}, re_estado = #{re_estado} where re_id=#{re_id}")
	void update(Reservas reserva);
	
	@Update("DELETE from reservas where re_id=#{re_id}")
	void delete(int re_id);
}
