package com.bptn.course._08_oop_demo;

class CartItem {
//create a product
	private Product product;
	private int cartQuantity;// this is the quantity the user wants to buy

	public CartItem(Product product, int quantity) {

		if (quantity > product.getProductQuantity()) {
			throw new IllegalArgumentException("Insufficient Stock");
		}

		this.product = product;
		this.cartQuantity = quantity;
	}

	// Getters / Accessor for cart item
	public Product getProduct() {
		return this.product;
	}

	public int getcartQuantity() {
		return this.cartQuantity;
	}

	// calculate the total price of the item
	public double getTotalPrice() {
		return product.getProductPrice() * this.cartQuantity;
	}
}
