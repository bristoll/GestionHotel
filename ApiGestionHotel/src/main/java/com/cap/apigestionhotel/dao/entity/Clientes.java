package com.cap.apigestionhotel.dao.entity;

public class Clientes {

	private String cli_dni;
	private String cli_nombre;
	private String cli_apellido;
	private String cli_email;
	private String cli_direccion;
	private int cli_codigopos;
	private String cli_ciudad;
	private String password;
	
	public String getCli_dni() {
		return cli_dni;
	}
	public void setCli_dni(String cli_dni) {
		this.cli_dni = cli_dni;
	}
	public String getCli_nombre() {
		return cli_nombre;
	}
	public void setCli_nombre(String cli_nombre) {
		this.cli_nombre = cli_nombre;
	}
	public String getCli_apellido() {
		return cli_apellido;
	}
	public void setCli_apellido(String cli_apellido) {
		this.cli_apellido = cli_apellido;
	}
	public String getCli_email() {
		return cli_email;
	}
	public void setCli_email(String cli_email) {
		this.cli_email = cli_email;
	}
	public String getCli_direccion() {
		return cli_direccion;
	}
	public void setCli_direccion(String cli_direccion) {
		this.cli_direccion = cli_direccion;
	}
	public int getCli_codigopos() {
		return cli_codigopos;
	}
	public void setCli_codigopos(int cli_codigopos) {
		this.cli_codigopos = cli_codigopos;
	}
	public String getCli_ciudad() {
		return cli_ciudad;
	}
	public void setCli_ciudad(String cli_ciudad) {
		this.cli_ciudad = cli_ciudad;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
			
}
