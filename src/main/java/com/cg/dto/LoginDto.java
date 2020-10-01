package com.cg.dto;

public class LoginDto {
	
	private String customer_ID;
	private String password;
	
	public LoginDto() {
		super();
		
	}
	public LoginDto(String customer_ID, String password) {
		super();
		this.customer_ID = customer_ID;
		this.password = password;
	}
	public String getCustomer_ID() {
		return customer_ID;
	}
	public void setCustomer_ID(String customer_ID) {
		this.customer_ID = customer_ID;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
