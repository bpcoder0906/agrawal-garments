package com.agrawal.imt.controller.rest.v1.shop;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.agrawal.imt.model.shop.ShoppingCart;
import com.agrawal.imt.services.shop.BillingSystem;
import com.google.gson.Gson;

@RestController
@RequestMapping(value = "shopActions.html")
public class ShopInvoiceController {

	@Autowired
	private BillingSystem _billingSystem;
	
	@RequestMapping(value = "generateInvoice", method = RequestMethod.POST, consumes = { "application/json" }, produces = {
			"application/json" })
	public long generateInvoice(@RequestBody String shopCart) {
		
		System.out.println(shopCart);
		
		Gson gson=new Gson();
		
		ShoppingCart spc=gson.fromJson(shopCart, ShoppingCart.class);
		
		System.out.println(spc.toString());
		
		ShoppingCart sc = spc;
		
		long billNumber=_billingSystem.billingEngine(sc);
		
		return billNumber; 
	}

}
