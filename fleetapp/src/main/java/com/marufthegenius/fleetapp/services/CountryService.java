package com.marufthegenius.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marufthegenius.fleetapp.models.Country;
import com.marufthegenius.fleetapp.repositories.CountryRepository;

@Service
public class CountryService {
@Autowired
private CountryRepository countryRepository;
	//Return a list of countries
	public List<Country> getCountries(){
	return countryRepository.findAll() ;
	
	}
	
	//Add a new country
	public void save(Country country) {
		countryRepository.save(country);
		
	}
	
	//get by id
	public Optional<Country> findById(Integer id) {
		return countryRepository.findById(id);
		
	}
   
	//Delete a Country 
	public void delete(Integer id) {
		countryRepository.deleteById(id);
		
	}
	
}
