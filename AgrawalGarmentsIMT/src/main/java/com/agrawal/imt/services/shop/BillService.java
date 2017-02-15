package com.agrawal.imt.services.shop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agrawal.imt.model.shop.Bill;
import com.agrawal.imt.repo.invoices.BillRepository;

@Service
public class BillService {

	@Autowired
	private BillRepository _billRepo;

	public boolean saveBillNumber(Bill bill) {
		try {
			_billRepo.save(bill);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public Bill getOldBillNumber() {
		try {
			return ((List<Bill>) _billRepo.findAll()).get(0);
		} catch (Exception e) {
			return null;
		}
	}

	public long generateNewBillNumber() {

		Bill tempbill=this.getOldBillNumber();
		long oldBillNumber = tempbill.getBillNumber();
		long newBillNumber = oldBillNumber + 1;
		
		tempbill.setBillNumber(newBillNumber);
		saveBillNumber(tempbill);
		return newBillNumber;

	}

}
