package com.shoppingmall.pojo;

public class Shop {
	private int shopId;
	private String shopName;
	private String shopProduct;
	
	public Shop() {
		
	}
	public Shop(int shopId, String shopName, String shopProduct) {
		super();
		this.shopId = shopId;
		this.shopName = shopName;
		this.shopProduct = shopProduct;
	}
	public int getShopId() {
		return shopId;
	}
	public void setShopId(int shopId) {
		this.shopId = shopId;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getShopProduct() {
		return shopProduct;
	}
	public void setShopProduct(String shopProduct) {
		this.shopProduct = shopProduct;
	}
	@Override
	public String toString() {
		return "Shop [shopId=" + shopId + ", shopName=" + shopName + ", shopProduct=" + shopProduct + "]";
	}
	
	

}
