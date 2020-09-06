package com.marufthegenius.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marufthegenius.fleetapp.models.VehicleMaintenance;
import com.marufthegenius.fleetapp.repositories.VehicleMaintenanceRepository;

@Service
public class VehicleMaintenanceService {
	@Autowired
	private VehicleMaintenanceRepository vehicleMaintenanceRepository;
		//Return a list of vehicleMaintenances
		public List<VehicleMaintenance> getVehicleMaintenances(){
		return vehicleMaintenanceRepository.findAll() ;
		
		}
		
		//Add a new vehicleMaintenance
		public void save(VehicleMaintenance vehicleMaintenance) {
			vehicleMaintenanceRepository.save(vehicleMaintenance);
			
		}
		
		//get by id
		public Optional<VehicleMaintenance> findById(Integer id) {
			return vehicleMaintenanceRepository.findById(id);
			
		}
	   
		//Delete a VehicleMaintenance 
		public void delete(Integer id) {
			vehicleMaintenanceRepository.deleteById(id);
			
		}

}
