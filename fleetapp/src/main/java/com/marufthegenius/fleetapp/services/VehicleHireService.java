package com.marufthegenius.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marufthegenius.fleetapp.models.VehicleHire;
import com.marufthegenius.fleetapp.repositories.VehicleHireRepository;

@Service
public class VehicleHireService {
	@Autowired
	private VehicleHireRepository vehicleHireRepository;
		//Return a list of vehicleHires
		public List<VehicleHire> getVehicleHires(){
		return vehicleHireRepository.findAll() ;
		
		}
		
		//Add a new vehicleHire
		public void save(VehicleHire vehicleHire) {
			vehicleHireRepository.save(vehicleHire);
			
		}
		
		//get by id
		public Optional<VehicleHire> findById(Integer id) {
			return vehicleHireRepository.findById(id);
			
		}
	   
		//Delete a VehicleHire 
		public void delete(Integer id) {
			vehicleHireRepository.deleteById(id);
			
		}

}
