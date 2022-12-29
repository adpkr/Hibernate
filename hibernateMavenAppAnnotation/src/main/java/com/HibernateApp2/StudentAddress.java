package com.HibernateApp2;


import java.util.Arrays;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;


@Entity
public class StudentAddress {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "address_Id")
	private int addressId;
	
	@Column(length = 50,name = "STREET")
	private String street;
	
	@Column(name = "CITY",length = 50)
	private String city;

	private boolean isOpen;
	
	@Transient
	private double x;
	
	@Column(name="add_Date")
	@Temporal(TemporalType.DATE)
	private Date addDate;
	
	@Lob
	private byte[] image;
	
	
	public StudentAddress() {
		super();
		// TODO Auto-generated constructor stub
	}


	public StudentAddress(int addressId, String street, String city, boolean isOpen, double x, Date addDate,
			byte[] image) {
		super();
		this.addressId = addressId;
		this.street = street;
		this.city = city;
		this.isOpen = isOpen;
		this.x = x;
		this.addDate = addDate;
		this.image = image;
	}


	public int getAddressId() {
		return addressId;
	}


	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}


	public String getStreet() {
		return street;
	}


	public void setStreet(String street) {
		this.street = street;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public boolean isOpen() {
		return isOpen;
	}


	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}


	public double getX() {
		return x;
	}


	public void setX(double x) {
		this.x = x;
	}


	public Date getAddDate() {
		return addDate;
	}


	public void setAddDate(Date addDate) {
		this.addDate = addDate;
	}


	public byte[] getImage() {
		return image;
	}


	public void setImage(byte[] image) {
		this.image = image;
	}


	@Override
	public String toString() {
		return "StudentAddress [addressId=" + addressId + ", street=" + street + ", city=" + city + ", isOpen=" + isOpen
				+ ", x=" + x + ", addDate=" + addDate + ", image=" + Arrays.toString(image) + "]";
	}
	
	
	

}
