package com.agrawal.imt.model.shop;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Bill {

	@Id
	@GeneratedValue()
	private long id;
	@Column
	private long billNumber;
	public Bill() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Bill(long id, long billNumber) {
		super();
		this.id = id;
		this.billNumber = billNumber;
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

	@Override
	public String toString() {
		return "Bill [id=" + id + ", billNumber=" + billNumber + ", getId()=" + getId() + ", getBillNumber()="
				+ getBillNumber() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	
}

