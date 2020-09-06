package com.marufthegenius.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marufthegenius.fleetapp.models.VehicleMake;
import com.marufthegenius.fleetapp.repositories.VehicleMakeRepository;

@Service
public class VehicleMakeService {
	
	
	@Autowired
	private VehicleMakeRepository vehicleMakeRepository;
		//Return a list of vehicleMakes
		public List<VehicleMake> getVehicleMakes(){
		return vehicleMakeRepository.findAll() ;
		
		}
		
		//Add a new vehicleMake
		public void save(VehicleMake vehicleMake) {
			vehicleMakeRepository.save(vehicleMake);
			
		}
		
		//get by id
		public Optional<VehicleMake> findById(Integer id) {
			return vehicleMakeRepository.findById(id);
			
		}
	   
		//Delete a VehicleMake 
		public void delete(Integer id) {
			vehicleMakeRepository.deleteById(id);
			
		}

}
