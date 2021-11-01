package com.shoppingmall.service;

import java.util.List;

import com.shoppingmall.pojo.Register;
import com.shoppingmall.pojo.Shop;
import com.shoppingmall.pojo.User;
import com.shoppingmall.pojo.UserLogin;

public interface DataAccessService {

	public void registerUser(User user);
	public void loginUser(UserLogin login);
	public Register findByEmail(String email);
	public List<Shop> findAllShops();
}
