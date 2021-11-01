package com.shoppingmall.pojo;

import java.util.HashSet;
import java.util.Set;

public class Products {
	private int productId;
	private String productName;
	private String productPrice;
	/* private Shop shop; */
	Set<Shop> shop = new HashSet<>(0);
	
	
	
	/*
	 * public Products(int productId, String productName, String productprice, Shop
	 * shop) { super(); this.productId = productId; this.productName = productName;
	 * this.productPrice = productprice; this.shop = shop; }
	 */
	
	
	public int getProductId() {
		return productId;
	}
	public Products(int productId, String productName, String productPrice, Set<Shop> shop) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.shop = shop;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(String productprice) {
		this.productPrice = productprice;
	}
	/*
	 * public Shop getShop() { return shop; } public void setShop(Shop shop) {
	 * this.shop = shop; }
	 */
	public Set<Shop> getShop() {
		return shop;
	}
	public void setShop(Set<Shop> shop) {
		this.shop = shop;
	}
	
	

}
