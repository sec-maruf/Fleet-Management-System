package com.marufthegenius.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marufthegenius.fleetapp.models.Supplier;
import com.marufthegenius.fleetapp.repositories.SupplierRepository;

@Service
public class SupplierService {
	@Autowired
	private SupplierRepository supplierRepository;
		//Return a list of suppliers
		public List<Supplier> getSuppliers(){
		return supplierRepository.findAll() ;
		
		}
		
		//Add a new supplier
		public void save(Supplier supplier) {
			supplierRepository.save(supplier);
			
		}
		
		//get by id
		public Optional<Supplier> findById(Integer id) {
			return supplierRepository.findById(id);
			
		}
	   
		//Delete a Supplier 
		public void delete(Integer id) {
			supplierRepository.deleteById(id);
			
		}

}
