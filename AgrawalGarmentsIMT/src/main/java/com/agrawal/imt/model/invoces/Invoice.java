package com.agrawal.imt.model.invoces;

import com.agrawal.imt.model.users.Column;
import com.agrawal.imt.model.users.GeneratedValue;
import com.agrawal.imt.model.users.Id;

public class Invoice {
	
	@Id
	@GeneratedValue()
	private long id;
	@Column
	private long srNo;
	@Column
	private long barcodeNumber;
	@Column
	private String size;
	@Column
	private double mrp;
	@Column
	private double rate;
	@Column
	private double tradeDiscount;
	@Column
	private long qty;
	@Column
	private double finalAmount;
	
	public Invoice() {
		super();
		}

	public Invoice(long id, long srNo, long barcodeNumber, String size, double mrp, double rate, double tradeDiscount,
			long qty, double finalAmount) {
		super();
		this.id = id;
		this.srNo = srNo;
		this.barcodeNumber = barcodeNumber;
		this.size = size;
		this.mrp = mrp;
		this.rate = rate;
		this.tradeDiscount = tradeDiscount;
		this.qty = qty;
		this.finalAmount = finalAmount;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getSrNo() {
		return srNo;
	}

	public void setSrNo(long srNo) {
		this.srNo = srNo;
	}

	public long getBarcodeNumber() {
		return barcodeNumber;
	}

	public void setBarcodeNumber(long barcodeNumber) {
		this.barcodeNumber = barcodeNumber;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public double getMrp() {
		return mrp;
	}

	public void setMrp(double mrp) {
		this.mrp = mrp;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public double getTradeDiscount() {
		return tradeDiscount;
	}

	public void setTradeDiscount(double tradeDiscount) {
		this.tradeDiscount = tradeDiscount;
	}

	public long getQty() {
		return qty;
	}

	public void setQty(long qty) {
		this.qty = qty;
	}

	public double getFinalAmount() {
		return finalAmount;
	}

	public void setFinalAmount(double finalAmount) {
		this.finalAmount = finalAmount;
	}

	@Override
	public String toString() {
		return "Invoice [id=" + id + ", srNo=" + srNo + ", barcodeNumber=" + barcodeNumber + ", size=" + size + ", mrp="
				+ mrp + ", rate=" + rate + ", tradeDiscount=" + tradeDiscount + ", qty=" + qty + ", finalAmount="
				+ finalAmount + "]";
	}
	
	
	
	
	


}
