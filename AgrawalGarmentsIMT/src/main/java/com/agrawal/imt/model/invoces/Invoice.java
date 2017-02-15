package com.agrawal.imt.model.invoces;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Invoice {

	@Id
	@GeneratedValue()
	private long id;
	@Column
	private long billNumber;
	@Column
	private long barcode;
	@Column
	private String productName;
	@Column
	private String size;
	@Column
	private long qty;
	@Column
	private double price;
	@Column
	private double discount;
	@Column
	private double finalAmount;
	@Column
	private long customerId;
	@Column
	private Date invoiceDate;

	public Invoice() {
		super();
	}

	public Invoice(long id, long billNumber, long barcode, String productName, String size, long qty, double price,
			double discount, double finalAmount, long customerId, Date invoiceDate) {
		super();
		this.id = id;
		this.billNumber = billNumber;
		this.barcode = barcode;
		this.productName = productName;
		this.size = size;
		this.qty = qty;
		this.price = price;
		this.discount = discount;
		this.finalAmount = finalAmount;
		this.customerId = customerId;
		this.invoiceDate = invoiceDate;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getBillNumber() {
		return billNumber;
	}

	public void setBillNumber(long billNumber) {
		this.billNumber = billNumber;
	}

	public long getBarcode() {
		return barcode;
	}

	public void setBarcode(long barcode) {
		this.barcode = barcode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public long getQty() {
		return qty;
	}

	public void setQty(long qty) {
		this.qty = qty;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getFinalAmount() {
		return finalAmount;
	}

	public void setFinalAmount(double finalAmount) {
		this.finalAmount = finalAmount;
	}

	public Date getInvoiceDate() {
		return invoiceDate;
	}

	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	@Override
	public String toString() {
		return "Invoice [id=" + id + ", billNumber=" + billNumber + ", barcode=" + barcode + ", productName="
				+ productName + ", size=" + size + ", qty=" + qty + ", price=" + price + ", discount=" + discount
				+ ", finalAmount=" + finalAmount + ", customerId=" + customerId + ", invoiceDate=" + invoiceDate + "]";
	}

}
