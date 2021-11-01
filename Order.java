package com.shoppingmall.pojo;

import java.util.HashSet;
import java.util.Set;

public class Order {
	private int orderId;
	//private Products products;
	private Set<Products> products;
			    //one to many relationship 
	private Set<Customer> customer;
	
	public Order() {
		
	}
	
	public Order(int orderId, Set<Products> products, Set<Customer> customer) {
		this.orderId = orderId;
		this.products = products;
		this.customer = customer;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public Set<Products> getProducts() {
		return products;
	}
	public void setProducts(Set<Products> products) {
		this.products = products;
	}
	public Set<Customer> getCustomer() {
		return customer;
	}
	public void setCustomer(Set<Customer> customer) {
		this.customer = customer;
	}
	
	
	
	
	

}
