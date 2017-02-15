package com.agrawal.imt.services.invoices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agrawal.imt.model.invoces.Invoice;
import com.agrawal.imt.repo.invoices.InvoiceRepository;

@Service
public class InvoiceService {
	
	@Autowired
	private InvoiceRepository _invoiceRepo;
	
	public Invoice createInvoice(Invoice invoice) {
		try {
			return _invoiceRepo.save(invoice);
		} catch (Exception e) {
			return null;
		}
	}
	
	

}
