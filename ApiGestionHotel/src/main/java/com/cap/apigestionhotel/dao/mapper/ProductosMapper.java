package com.cap.apigestionhotel.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.cap.apigestionhotel.dao.entity.Productos;

@Mapper
public interface ProductosMapper {
	
	@Select("SELECT * FROM productos")
	List<Productos> findAll();
	
	@Insert("INSERT INTO productos (pro_nombre, pro_unidad_medida, pro_precio_venta) VALUES (#{pro_nombre}, #{pro_unidad_medida}, #{pro_precio_venta})")
	void insert(Productos producto);
	
	@Select("SELECT * FROM productos where pro_id = #{pro_id}")
	Productos findProductos(int pro_id);

	@Update("UPDATE productos SET pro_nombre = #{pro_nombre}, pro_unidad_medida = #{pro_unidad_medida},pro_precio_venta = #{pro_precio_venta} = where pro_id=#{pro_id}")
	void update(Productos producto);

	@Update("DELETE from productos where pro_id=#{pro_id}")
	void delete(int pro_id);
	

}
