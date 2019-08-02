package com.cap.apigestionhotel.dao.entity;

public class Hoteles {

	private int ho_id;
	private String ho_nombre;
	private String ho_categoria;
	private String ho_zona;
	private String ho_direccion;
	
	public int getHo_id() {
		return ho_id;
	}
	public void setHo_id(int ho_id) {
		this.ho_id = ho_id;
	}
	public String getHo_nombre() {
		return ho_nombre;
	}
	public void setHo_nombre(String ho_nombre) {
		this.ho_nombre = ho_nombre;
	}
	public String getHo_categoria() {
		return ho_categoria;
	}
	public void setHo_categoria(String ho_categoria) {
		this.ho_categoria = ho_categoria;
	}
	public String getHo_direccion() {
		return ho_direccion;
	}
	public void setHo_direccion(String ho_direccion) {
		this.ho_direccion = ho_direccion;
	}
	public String getHo_zona() {
		return ho_zona;
	}
	public void setHo_zona(String ho_zona) {
		this.ho_zona = ho_zona;
	}
	
}
