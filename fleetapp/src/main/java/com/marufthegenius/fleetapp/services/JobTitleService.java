package com.marufthegenius.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marufthegenius.fleetapp.models.JobTitle;
import com.marufthegenius.fleetapp.repositories.JobTitleRepository;

@Service
public class JobTitleService {
	@Autowired
	private JobTitleRepository jobTitleRepository;
		//Return a list of jobTitles
		public List<JobTitle> getJobTitles(){
		return jobTitleRepository.findAll() ;
		
		}
		
		//Add a new jobTitle
		public void save(JobTitle jobTitle) {
			jobTitleRepository.save(jobTitle);
			
		}
		
		//get by id
		public Optional<JobTitle> findById(Integer id) {
			return jobTitleRepository.findById(id);
			
		}
	   
		//Delete a JobTitle 
		public void delete(Integer id) {
			jobTitleRepository.deleteById(id);
			
		}

}
