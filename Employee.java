package com.shoppingmall.pojo;

import java.util.HashSet;
import java.util.Set;

public class Employee {
	 private int empId;
	 private String empName;
	 private  int empSalary;
	 private Shop shop ;
	 
	 public Employee() {
		 
	 }
	 
	public Employee(int empId, String empName, int empSalary, Shop shop) {
		
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.shop =shop;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}

	public Shop getShop() {
		return shop;
	}

	public void setShop(Shop shop) {
		this.shop = shop;
	}

	 
	 

}
