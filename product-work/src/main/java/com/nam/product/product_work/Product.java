package com.nam.product.product_work;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	private int productID;
	private String productName;
	private int productPrice;
	private int quantity;
	private int productTax;
	private int totalPrice;
	public Product() {}
	public Product(int productID, String productName, int productPrice, int quantity, int productTax, int totalPrice) {
		super();
		this.productID = productID;
		this.productName = productName;
		this.productPrice = productPrice;
		this.quantity = quantity;
		this.productTax = productTax;
		this.totalPrice = totalPrice;
	}
	public int getProductID() {
		return productID;
	}
	public void setProductID(int productID) {
		this.productID = productID;
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
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getProductTax() {
		return productTax;
	}
	public void setProductTax(int productTax) {
		this.productTax = productTax;
	}
	public int getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	
}
