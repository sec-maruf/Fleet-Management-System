package com.marufthegenius.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marufthegenius.fleetapp.models.Invoice;
import com.marufthegenius.fleetapp.repositories.InvoiceRepository;

@Service
public class InvoiceService {
	
	
	@Autowired
	private InvoiceRepository invoiceRepository;
		//Return a list of invoices
		public List<Invoice> getInvoices(){
		return invoiceRepository.findAll() ;
		
		}
		
		//Add a new invoice
		public void save(Invoice invoice) {
			invoiceRepository.save(invoice);
			
		}
		
		//get by id
		public Optional<Invoice> findById(Integer id) {
			return invoiceRepository.findById(id);
			
		}
	   
		//Delete a Invoice 
		public void delete(Integer id) {
			invoiceRepository.deleteById(id);
			
		}

}
