package com.agrawal.imt.services.customers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agrawal.imt.model.customers.Customer;
import com.agrawal.imt.repo.customers.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository _customerRepo;
	
	public Customer createCustomer(Customer customer) {
		try {
			return _customerRepo.save(customer);
		} catch (Exception e) {
			return null;
		}
	}
	
	
	
}
