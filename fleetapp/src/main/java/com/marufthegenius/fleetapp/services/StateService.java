package com.marufthegenius.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marufthegenius.fleetapp.models.State;
import com.marufthegenius.fleetapp.repositories.StateRepository;

@Service
public class StateService {
	@Autowired
	private StateRepository stateRepository;
		//Return a list of states
		public List<State> getStates(){
		return stateRepository.findAll() ;
		
		}
		
		//Add a new state
		public void save(State state) {
			stateRepository.save(state);
			
		}
		
		//get by id
		public Optional<State> findById(Integer id) {
			return stateRepository.findById(id);
			
		}
	   
		//Delete a State 
		public void delete(Integer id) {
			stateRepository.deleteById(id);
			
		}

}
