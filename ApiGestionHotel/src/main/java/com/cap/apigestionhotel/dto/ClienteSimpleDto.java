package com.cap.apigestionhotel.dto;

public class ClienteSimpleDto {

	private String dni;
	private String nombreCompleto;
	private String email;
	private String ciudad;
	
	public ClienteSimpleDto(String dni, String nombreCompleto, String email, String ciudad) {
		this.dni = dni;
		this.nombreCompleto = nombreCompleto;
		this.email = email;
		this.ciudad = ciudad;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombreCompleto() {
		return nombreCompleto;
	}
	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	
	
}
