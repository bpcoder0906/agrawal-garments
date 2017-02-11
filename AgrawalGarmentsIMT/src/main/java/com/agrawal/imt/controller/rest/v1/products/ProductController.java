package com.agrawal.imt.controller.rest.v1.products;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.agrawal.imt.model.products.Product;
import com.agrawal.imt.services.products.ProductService;

@RestController
@RequestMapping(value = "productActions.html")
public class ProductController {

	@Autowired
	ProductService _productService;

	@RequestMapping(value = "add", method = RequestMethod.POST, consumes = { "application/json" }, produces = {
			"application/json" })
	public boolean addProduct(@RequestBody Product product) {
		return _productService.addProduct(product);
	}
}
