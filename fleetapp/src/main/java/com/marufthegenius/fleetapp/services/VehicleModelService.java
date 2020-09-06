package com.marufthegenius.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marufthegenius.fleetapp.models.VehicleModel;
import com.marufthegenius.fleetapp.repositories.VehicleModelRepository;

@Service
public class VehicleModelService {
	@Autowired
	private VehicleModelRepository vehicleModelRepository;
		//Return a list of vehicleModels
		public List<VehicleModel> getVehicleModels(){
		return vehicleModelRepository.findAll() ;
		
		}
		
		//Add a new vehicleModel
		public void save(VehicleModel vehicleModel) {
			vehicleModelRepository.save(vehicleModel);
			
		}
		
		//get by id
		public Optional<VehicleModel> findById(Integer id) {
			return vehicleModelRepository.findById(id);
			
		}
	   
		//Delete a VehicleModel 
		public void delete(Integer id) {
			vehicleModelRepository.deleteById(id);
			
		}


}
