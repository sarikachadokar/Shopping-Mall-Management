package com.shoppingmall.pojo;


import java.util.HashSet;
import java.util.Set;

public class UserRegister {
	private String uName;
	private String uEmail;
	private String uRole;
	private String uPassword;
	private Set<Shop> shops = new HashSet<>(0);
	
	public UserRegister() {
		
	}
	
	public UserRegister(String uName, String uEmail, String uRole, String uPassword, Set<Shop> shops) {
		super();
		this.uName = uName;
		this.uEmail = uEmail;
		this.uRole = uRole;
		this.uPassword = uPassword;
		this.shops = shops;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getuEmail() {
		return uEmail;
	}
	public void setuEmail(String uEmail) {
		this.uEmail = uEmail;
	}
	public String getuRole() {
		return uRole;
	}
	public void setuRole(String uRole) {
		this.uRole = uRole;
	}
	public String getuPassword() {
		return uPassword;
	}
	public void setuPassword(String uPassword) {
		this.uPassword = uPassword;
	}
	public Set<Shop> getShops() {
		return shops;
	}
	public void setShops(Set<Shop> shops) {
		this.shops = shops;
	}
	
	

}
