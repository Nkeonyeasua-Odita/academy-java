package com.bptn.course._08_oop_demo;

class Product {

	// instance varible
	private String productID;
	private String productName;
	private double productPrice;
	private int productQuantity;
	// constructor

	public Product(String productID, String productName, double productPrice, int productQuantity) {
		this.productID = productID;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productQuantity = productQuantity;
	}

	// Getters / Accessors nothing but return the values
	public String getProductID() {
		return this.productID;// returning the current productid
	}

	public String getProductName() {
		return this.productName;
	}

	public double getProductPrice() {
		return this.productPrice;
	}

	public int getProductQuantity() {
		return this.productQuantity;
	}

	// Mutator
	public void reduceStock(int quantity) {// you connect the user request?-input from the user
		if (quantity <= productQuantity) {// reduce stock after purchase
			this.productQuantity -= quantity;
		} else {
			throw new IllegalArgumentException("Insufficient Stock");
			// this is to throw in an exception. lets say you have 10 quats and 5
			// prodquantity it will output -5
		}
	}

}
