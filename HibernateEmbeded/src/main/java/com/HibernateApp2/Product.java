package com.HibernateApp2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
	
	@Id
	private int productId;
	
	@Column(name = "Product_Name")
	private String productName;
	
	@Column(name = "Product_Price")
	private int productPrice;
	
	@Column(name = "Expiry_Date")
	private String productExp;
	
	private Company com;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(int productId, String productName, int productPrice, String productExp, Company com) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productExp = productExp;
		this.com = com;
	}

	public int getProductId() {
		return productId;
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

	public int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductExp() {
		return productExp;
	}

	public void setProductExp(String productExp) {
		this.productExp = productExp;
	}

	public Company getCom() {
		return com;
	}

	public void setCom(Company com) {
		this.com = com;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", productExp=" + productExp + ", com=" + com + "]";
	}

	

}
