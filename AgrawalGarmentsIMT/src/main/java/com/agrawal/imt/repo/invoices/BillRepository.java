package com.agrawal.imt.repo.invoices;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import com.agrawal.imt.model.shop.Bill;


@Transactional
public interface BillRepository extends CrudRepository<Bill, Long>{

	public Bill findByBillNumber (long billNumber);
	
}
