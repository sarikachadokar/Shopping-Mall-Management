package com.shoppingmall.pojo;


public class Register {
   private int id;
   private  String name;
   private String role;
   private long phoneNo;
   private  String emailId;
   private String password;
   public String getRole() {
	return role;
}



public void setRole(String role) {
	this.role = role;
}




    
    public Register() {
    	
    }
    
    
   
	public Register(String name, long phoneNo, String emailId, String password) {
		
		this.name = name;
		this.phoneNo= phoneNo;
		this.emailId = emailId;
		this.password = password;
	}



	public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public long getPhoneNo() {
	return phoneNo;
}


public void setPhoneNo(long phoneNo) {
	this.phoneNo = phoneNo;
}


public String getEmailId() {
	return emailId;
}


public void setEmailId(String emailId) {
	this.emailId = emailId;
}


public String getPassword() {
	return password;
}


public void setPassword(String password) {
	this.password = password;
}



public int getId() {
	return id;
}



public void setId(int id) {
	this.id = id;
}



@Override
public String toString() {
	return "Register [id=" + id + ", name=" + name + ", phoneNo=" + phoneNo +", emailId=" + emailId + ", password="
			+ password + "]";
}






}
