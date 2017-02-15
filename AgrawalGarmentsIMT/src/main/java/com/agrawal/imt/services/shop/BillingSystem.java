package com.agrawal.imt.services.shop;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agrawal.imt.model.customers.Customer;
import com.agrawal.imt.model.invoces.Invoice;
import com.agrawal.imt.model.products.Product;
import com.agrawal.imt.model.shop.ShoppingCart;
import com.agrawal.imt.services.customers.CustomerService;
import com.agrawal.imt.services.invoices.InvoiceService;
import com.agrawal.imt.services.products.ProductService;

@Service
public class BillingSystem {

	@Autowired
	private CustomerService _customerService;

	@Autowired
	private InvoiceService _invoiceService;

	@Autowired
	private BillService _billService;

	@Autowired
	private ProductService _productService;

	public long billingEngine(ShoppingCart shoppingCart) {
		Customer cust = shoppingCart.getCustomer();
		List<Product> cartPoducts = shoppingCart.getCartProducts();
		long billNumber = _billService.generateNewBillNumber();

		List<Invoice> invoiceList = new ArrayList<>();

		Customer customer = _customerService.createCustomer(cust);
		for (Product pdct : cartPoducts) {
			Invoice invoice = new Invoice();
			invoice.setBillNumber(billNumber);
			invoice.setCustomerId(customer.getId());
			invoice.setInvoiceDate(new Date());
			invoice.setBarcode(pdct.getBarcode());
			invoice.setSize(pdct.getSize());
			invoice.setProductName(pdct.getName());
			invoice.setQty(pdct.getQty());
			invoice.setPrice(pdct.getPrice());
			invoice.setDiscount(pdct.getDiscount());
			invoice.setFinalAmount((pdct.getQty() * pdct.getPrice()) - pdct.getDiscount());

			Invoice newInvoice = _invoiceService.createInvoice(invoice);

			Product tempProduct = _productService.getProductByBarcode(pdct.getBarcode());
			tempProduct.setId(pdct.getId());
			tempProduct.setQty((tempProduct.getQty() - pdct.getQty()));

			_productService.updateProduct(tempProduct);

			invoiceList.add(newInvoice);
		}

		return billNumber;
	}

}
