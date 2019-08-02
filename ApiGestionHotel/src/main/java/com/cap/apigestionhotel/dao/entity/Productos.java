package com.cap.apigestionhotel.dao.entity;

public class Productos {
	
	private int pro_id;
	private String pro_nombre, pro_unidad_medida;
	private float pro_precio_venta;
	public int getPro_id() {
		return pro_id;
	}
	public void setPro_id(int pro_id) {
		this.pro_id = pro_id;
	}
	public String getPro_nombre() {
		return pro_nombre;
	}
	public void setPro_nombre(String pro_nombre) {
		this.pro_nombre = pro_nombre;
	}
	public String getPro_unidad_medida() {
		return pro_unidad_medida;
	}
	public void setPro_unidad_medida(String pro_unidad_medida) {
		this.pro_unidad_medida = pro_unidad_medida;
	}
	public float getPro_precio_venta() {
		return pro_precio_venta;
	}
	public void setPro_precio_venta(float pro_precio_venta) {
		this.pro_precio_venta = pro_precio_venta;
	}
	
	

}
