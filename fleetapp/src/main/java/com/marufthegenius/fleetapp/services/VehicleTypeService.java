package com.marufthegenius.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marufthegenius.fleetapp.models.VehicleType;
import com.marufthegenius.fleetapp.repositories.VehicleTypeRepository;

@Service
public class VehicleTypeService {

	@Autowired
	private VehicleTypeRepository vehicleTypeRepository;
		//Return a list of vehicleTypes
		public List<VehicleType> getVehicleTypes(){
		return vehicleTypeRepository.findAll() ;
		
		}
		
		//Add a new vehicleType
		public void save(VehicleType vehicleType) {
			vehicleTypeRepository.save(vehicleType);
			
		}
		
		//get by id
		public Optional<VehicleType> findById(Integer id) {
			return vehicleTypeRepository.findById(id);
			
		}
	   
		//Delete a VehicleType 
		public void delete(Integer id) {
			vehicleTypeRepository.deleteById(id);
			
		}
}
