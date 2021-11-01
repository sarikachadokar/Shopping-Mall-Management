package com.shoppingmall.pojo;

import java.util.HashSet;
import java.util.Set;

public class User {
private int  userId;
private String userName;
private String userRole;
private String password;
private String emailId;
private Shop shop ;
public User() {
	
}



public User(int userId, String userName, String userRole, String password, String emailId,
		Shop shop) {
	this.userId = userId;
	this.userName = userName;
	this.userRole = userRole;
	this.password = password;
	this.emailId = emailId;
	this.shop = shop;
}
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getUserRole() {
	return userRole;
}
public void setUserRole(String userRole) {
	this.userRole = userRole;
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
public Shop getShop() {
	return shop;
}
public void setShop(Shop shop) {
	this.shop = shop;
}



@Override
public String toString() {
	return "User [userId=" + userId + ", userName=" + userName + ", userRole=" + userRole + ", password=" + password
			+ ", emailId=" + emailId + ", shop=" + shop + "]";
}







}
