package com.agrawal.imt.services.products;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agrawal.imt.model.products.Product;
import com.agrawal.imt.repo.products.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository _productRepository;

	public boolean addProduct(Product product) {
		try {
			_productRepository.save(product);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public List<Product> getAllProductsList() {
		List<Product> productList = new ArrayList<>();
		try {
			productList = (List<Product>) _productRepository.findAll();
			return productList;
		} catch (Exception e) {
		}
		return productList;
	}
}
