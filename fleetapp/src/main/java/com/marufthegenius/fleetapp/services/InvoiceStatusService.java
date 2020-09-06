package com.marufthegenius.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marufthegenius.fleetapp.models.InvoiceStatus;
import com.marufthegenius.fleetapp.repositories.InvoiceStatusRepository;

@Service
public class InvoiceStatusService {
	@Autowired
	private InvoiceStatusRepository invoiceStatusRepository;
		//Return a list of invoiceStatuses
		public List<InvoiceStatus> getInvoiceStatuses(){
		return invoiceStatusRepository.findAll() ;
		
		}
		
		//Add a new invoiceStatus
		public void save(InvoiceStatus invoiceStatus) {
			invoiceStatusRepository.save(invoiceStatus);
			
		}
		
		//get by id
		public Optional<InvoiceStatus> findById(Integer id) {
			return invoiceStatusRepository.findById(id);
			
		}
	   
		//Delete a InvoiceStatus 
		public void delete(Integer id) {
			invoiceStatusRepository.deleteById(id);
			
		}

}
