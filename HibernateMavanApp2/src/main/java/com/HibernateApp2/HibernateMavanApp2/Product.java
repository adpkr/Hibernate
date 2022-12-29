package com.HibernateApp2.HibernateMavanApp2;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
	
	@Id
	
	private int ProductId;
	private String ProductName;
	private int ProductPrice;
	private int ProductQuantity;
	
	public Product() {
		super();
	}
	
	public Product(int productId, String productName, int productPrice, int productQuantity) {
		super();
		ProductId = productId;
		ProductName = productName;
		ProductPrice = productPrice;
		ProductQuantity = productQuantity;
	}


	public int getProductId() {
		return ProductId;
	}


	public void setProductId(int productId) {
		ProductId = productId;
	}


	public String getProductName() {
		return ProductName;
	}


	public void setProductName(String productName) {
		ProductName = productName;
	}


	public int getProductPrice() {
		return ProductPrice;
	}


	public void setProductPrice(int productPrice) {
		ProductPrice = productPrice;
	}


	public int getProductQuantity() {
		return ProductQuantity;
	}


	public void setProductQuantity(int productQuantity) {
		ProductQuantity = productQuantity;
	}


	@Override
	public String toString() {
		return "Product [ProductId=" + ProductId + ", ProductName=" + ProductName + ", ProductPrice=" + ProductPrice
				+ ", ProductQuantity=" + ProductQuantity + "]";
	}
	
	

}
