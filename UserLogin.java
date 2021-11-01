package com.shoppingmall.pojo;

public class UserLogin {
	
	private String password;
	private String emailId;
	
	
	public UserLogin() {
		
	}
	


	public UserLogin(String password, String emailId) {
		super();
		this.password = password;
		this.emailId = emailId;
	}



	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getEmailId() {
		return emailId;
	}


	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}



	@Override
	public String toString() {
		return "UserLogin [password=" + password + ", emailId=" + emailId + "]";
	}
	
	

}
