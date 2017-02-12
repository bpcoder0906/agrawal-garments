package com.agrawal.imt.controller.rest.v1.products;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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

	@RequestMapping(value = "update", method = RequestMethod.POST, consumes = { "application/json" }, produces = {
			"application/json" })
	public boolean updateProduct(@RequestBody Product product, @RequestParam("id") long id) {
		product.setId(id);
		return _productService.updateProduct(product);
	}

	@RequestMapping(value = "delete", method = RequestMethod.POST, consumes = { "application/json" }, produces = {
			"application/json" })
	public boolean deleteProduct(@RequestParam("id") long id) {
		return _productService.deleteProduct(id);
	}

	@RequestMapping(value = "getAllProducts", method = RequestMethod.POST, consumes = {
			"application/json" }, produces = { "application/json" })
	public List<Product> getAllProductList() {
		return _productService.getAllProductsList();
	}

	@RequestMapping(value = "getProductByBarcode", method = RequestMethod.POST, consumes = {
			"application/json" }, produces = { "application/json" })
	public Product getProductByBarcode(@RequestParam("barcode") long barcode) {
		return _productService.getProductByBarcode(barcode);
	}

}
