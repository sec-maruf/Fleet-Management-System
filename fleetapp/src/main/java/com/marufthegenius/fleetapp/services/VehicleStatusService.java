package com.marufthegenius.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marufthegenius.fleetapp.models.VehicleStatus;
import com.marufthegenius.fleetapp.repositories.VehicleStatusRepository;

@Service
public class VehicleStatusService {
	@Autowired
	private VehicleStatusRepository vehicleStatusRepository;
		//Return a list of vehicleStatuss
		public List<VehicleStatus> getVehicleStatuses(){
		return vehicleStatusRepository.findAll() ;
		
		}
		
		//Add a new vehicleStatus
		public void save(VehicleStatus vehicleStatus) {
			vehicleStatusRepository.save(vehicleStatus);
			
		}
		
		//get by id
		public Optional<VehicleStatus> findById(Integer id) {
			return vehicleStatusRepository.findById(id);
			
		}
	   
		//Delete a VehicleStatus 
		public void delete(Integer id) {
			vehicleStatusRepository.deleteById(id);
			
		}


}
