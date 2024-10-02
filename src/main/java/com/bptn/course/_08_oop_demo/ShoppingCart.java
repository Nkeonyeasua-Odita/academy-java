package com.bptn.course._08_oop_demo;

class ShoppingCart {
	// to add multiple product, thats why the arrAy is here

	private CartItem[] items;// 0,1,2,3,4
	private int itemCount;

	public ShoppingCart() {

		items = new CartItem[5];// this is to initialize the size of the array like {1,2,3...}
		itemCount = 0;
	}

	// add product to cART
	public void addProductToCart(Product product, int quantity) {// this is to update the shopping cart
		if(itemCount <=4) {
		CartItem newItem = new CartItem(product, quantity);
		items[itemCount] = newItem;
		itemCount++;
		product.reduceStock (quantity);
		}else {
			throw new IllegalArgumentException("Cart full");
		}
	}
	//showProductsInCart
	public CartItem[] showProductsInCart() {
		CartItem[] currentItems = new CartItem[itemCount];
		// loop through the array to get the item data
		for (int i = 0; i<itemCount; i++) {
			currentItems[i] = items[i];
		}
		return currentItems;

	}

}
