package com.agrawal.imt.model.products;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	@GeneratedValue()
	private long id;
	@Column
	private long barcode;
	@Column
	private String name;
	@Column
	private double price;
	@Column
	private String color;
	@Column
	private String size;
	@Column
	private String description;
	@Column
	private int qty;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Product(long id, long barcode, String name, double price, String color, String size, String description,
			int qty) {
		super();
		this.id = id;
		this.barcode = barcode;
		this.name = name;
		this.price = price;
		this.color = color;
		this.size = size;
		this.description = description;
		this.qty = qty;
	}


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}


	public long getBarcode() {
		return barcode;
	}


	public void setBarcode(long barcode) {
		this.barcode = barcode;
	}


	@Override
	public String toString() {
		return "Product [id=" + id + ", barcode=" + barcode + ", name=" + name + ", price=" + price + ", color=" + color
				+ ", size=" + size + ", description=" + description + ", qty=" + qty + "]";
	}

	
}
