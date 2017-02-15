package com.agrawal.imt.repo.customers;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import com.agrawal.imt.model.customers.Customer;
import com.agrawal.imt.model.invoces.Invoice;

@Transactional
public interface CustomerRepository extends CrudRepository<Customer, Long> {

	public Invoice findByName(String customerName);

}
