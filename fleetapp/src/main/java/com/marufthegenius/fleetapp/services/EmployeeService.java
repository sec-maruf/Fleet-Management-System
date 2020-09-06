package com.marufthegenius.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marufthegenius.fleetapp.models.Employee;
import com.marufthegenius.fleetapp.repositories.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;
		//Return a list of employees
		public List<Employee> getEmployees(){
		return employeeRepository.findAll() ;
		
		}
		
		//Add a new employee
		public void save(Employee employee) {
			employeeRepository.save(employee);
			
		}
		
		//get by id
		public Optional<Employee> findById(Integer id) {
			return employeeRepository.findById(id);
			
		}
	   
		//Delete a employee 
		public void delete(Integer id) {
			employeeRepository.deleteById(id);
			
		}

		public Employee findbyUsername(String userName) {
			return employeeRepository.findByUsername(userName);
		}

}
