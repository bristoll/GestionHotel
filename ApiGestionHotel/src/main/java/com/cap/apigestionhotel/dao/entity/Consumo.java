package com.cap.apigestionhotel.dao.entity;

public class Consumo {

	private int con_id;
	private int con_re_id;
	private int con_pro_id;
	private float con_cantidad;
	private float con_precio_venta;
	private String con_estado;
	public int getCon_id() {
		return con_id;
	}
	public void setCon_id(int con_id) {
		this.con_id = con_id;
	}
	public int getCon_re_id() {
		return con_re_id;
	}
	public void setCon_re_id(int con_re_id) {
		this.con_re_id = con_re_id;
	}
	public int getCon_pro_id() {
		return con_pro_id;
	}
	public void setCon_pro_id(int con_pro_id) {
		this.con_pro_id = con_pro_id;
	}
	public float getCon_cantidad() {
		return con_cantidad;
	}
	public void setCon_cantidad(float con_cantidad) {
		this.con_cantidad = con_cantidad;
	}
	public float getCon_precio_venta() {
		return con_precio_venta;
	}
	public void setCon_precio_venta(float con_precio_venta) {
		this.con_precio_venta = con_precio_venta;
	}
	public String getCon_estado() {
		return con_estado;
	}
	public void setCon_estado(String con_estado) {
		this.con_estado = con_estado;
	}
	
	
	
}
