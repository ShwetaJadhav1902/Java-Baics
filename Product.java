package com.javabasics;

public class Product {
	int productId;
	String productName;
	double productPrice;
	
	void initProInfo() {
		productId=101;
		productName="Fridge";
		productPrice=21000;
	}
	
	void printInfo() {
		System.out.println("product Id:"+productId);
		System.out.println("product Name:"+productName);
		System.out.println("productPrice:"+productPrice);
	}
	public static void main(String[] args) {
		Product p;
		p=new Product();
		p.initProInfo();
		p.printInfo();
	
	}

}
