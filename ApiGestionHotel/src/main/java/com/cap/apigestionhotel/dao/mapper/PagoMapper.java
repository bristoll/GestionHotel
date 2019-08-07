package com.cap.apigestionhotel.dao.mapper;

import java.sql.Date;
import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.cap.apigestionhotel.dao.entity.Pago;

@Mapper
public interface PagoMapper {
	
	@Select("SELECT * FROM pago")
	List<Pago> findAll();

	@Select("SELECT * FROM pago where pag_id = #{pag_id}")
	Pago findPago(int pag_id);

	@Insert("INSERT INTO pago (pag_re_id, pag_total, pag_fecha_pago) VALUES (#{pag_re_id}, #{pag_total}, #{pag_fecha_pago})")
	void insert(Pago pago);

	@Update("UPDATE pago SET pag_re_id = #{pag_re_id}, pag_total = #{pag_total},pag_fecha_pago = #{pag_fecha_pago} = where pag_id=#{pag_id}")
	void update(Pago pago);

	@Update("DELETE from pago where pag_id=#{pag_id}")
	void delete(int pag_id);
	

}
