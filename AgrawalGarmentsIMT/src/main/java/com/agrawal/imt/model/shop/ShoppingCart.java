package com.agrawal.imt.model.shop;

import java.util.Date;
import java.util.List;

import com.agrawal.imt.model.customers.Customer;
import com.agrawal.imt.model.products.Product;

public class ShoppingCart {

	private Customer customer;
	private List<Product> cartProducts;
	private Date shoppingDate;
	public ShoppingCart() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ShoppingCart(Customer customer, List<Product> cartProducts, Date shoppingDate) {
		super();
		this.customer = customer;
		this.cartProducts = cartProducts;
		this.shoppingDate = shoppingDate;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public List<Product> getCartProducts() {
		return cartProducts;
	}
	public void setCartProducts(List<Product> cartProducts) {
		this.cartProducts = cartProducts;
	}
	public Date getShoppingDate() {
		return shoppingDate;
	}
	public void setShoppingDate(Date shoppingDate) {
		this.shoppingDate = shoppingDate;
	}
	@Override
	public String toString() {
		return "ShoppingCart [customer=" + customer + ", cartProducts=" + cartProducts + ", shoppingDate="
				+ shoppingDate + "]";
	}
	
	
}
