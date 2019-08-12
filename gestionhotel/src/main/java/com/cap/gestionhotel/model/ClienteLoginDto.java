package com.cap.gestionhotel.model;

public class ClienteLoginDto {

	private String email;
	private String pass;
	
	private static final ClienteLoginDto INSTANCE = new ClienteLoginDto();
	
	private ClienteLoginDto() {}
	
	public static ClienteLoginDto getInstance() {
        return INSTANCE;
    }
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPass() {
		return pass;
	}
	
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	
	
}
