package com.agrawal.imt.repo.products;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import com.agrawal.imt.model.products.Product;


@Transactional
public interface ProductRepository extends CrudRepository<Product, Long>{
	public Product findByName(String productName);
}
