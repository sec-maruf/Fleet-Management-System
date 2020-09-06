package com.marufthegenius.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marufthegenius.fleetapp.models.Client;
import com.marufthegenius.fleetapp.repositories.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository clientRepository;
		//Return a list of clients
		public List<Client> getClients(){
		return clientRepository.findAll() ;
		
		}
		
		//Add a new client
		public void save(Client client) {
			clientRepository.save(client);
			
		}
		
		//get by id
		public Optional<Client> findById(Integer id) {
			return clientRepository.findById(id);
			
		}
	   
		//Delete a Client 
		public void delete(Integer id) {
			clientRepository.deleteById(id);
			
		}

}
