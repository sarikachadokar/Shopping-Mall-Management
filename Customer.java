package com.shoppingmall.pojo;

public class Customer {
private int cid;
private String name;
private String email;
private String phone;
public Customer() {
	
}

public Customer(int cid, String name, String email, String phone) {
	
	this.cid = cid;
	this.name = name;
	this.email = email;
	this.phone = phone;
}
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}



}
