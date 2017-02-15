package com.agrawal.imt.repo.invoices;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import com.agrawal.imt.model.invoces.Invoice;

@Transactional
public interface InvoiceRepository extends CrudRepository<Invoice, Long> {

	public Invoice findByBillNumber(long billNumber);
}
