package com.marufthegenius.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marufthegenius.fleetapp.models.EmployeeType;
import com.marufthegenius.fleetapp.repositories.EmployeeTypeRepository;

@Service
public class EmployeeTypeService {
	@Autowired
	private EmployeeTypeRepository employeeTypeRepository;
		//Return a list of employeeTypes
		public List<EmployeeType> getEmployeeTypes(){
		return employeeTypeRepository.findAll() ;
		
		}
		
		//Add a new employeeType
		public void save(EmployeeType employeeType) {
			employeeTypeRepository.save(employeeType);
			
		}
		
		//get by id
		public Optional<EmployeeType> findById(Integer id) {
			return employeeTypeRepository.findById(id);
			
		}
	   
		//Delete a EmployeeType 
		public void delete(Integer id) {
			employeeTypeRepository.deleteById(id);
			
		}

}
