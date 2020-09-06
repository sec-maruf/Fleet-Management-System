package com.marufthegenius.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marufthegenius.fleetapp.models.VehicleMovement;
import com.marufthegenius.fleetapp.repositories.VehicleMovementRepository;

@Service
public class VehicleMovementService {
	@Autowired
	private VehicleMovementRepository vehicleMovementRepository;
		//Return a list of vehicleMovements
		public List<VehicleMovement> getVehicleMovements(){
		return vehicleMovementRepository.findAll() ;
		
		}
		
		//Add a new vehicleMovement
		public void save(VehicleMovement vehicleMovement) {
			vehicleMovementRepository.save(vehicleMovement);
			
		}
		
		//get by id
		public Optional<VehicleMovement> findById(Integer id) {
			return vehicleMovementRepository.findById(id);
			
		}
	   
		//Delete a VehicleMovement 
		public void delete(Integer id) {
			vehicleMovementRepository.deleteById(id);
			
		}

}
