package com.marufthegenius.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marufthegenius.fleetapp.models.Location;
import com.marufthegenius.fleetapp.repositories.LocationRepository;

@Service
public class LocationService {
	@Autowired
	private LocationRepository locationRepository;
		//Return a list of locations
		public List<Location> getLocations(){
		return locationRepository.findAll() ;
		
		}
		
		//Add a new location
		public void save(Location location) {
			locationRepository.save(location);
			
		}
		
		//get by id
		public Optional<Location> findById(Integer id) {
			return locationRepository.findById(id);
			
		}
	   
		//Delete a Location 
		public void delete(Integer id) {
			locationRepository.deleteById(id);
			
		}

}
