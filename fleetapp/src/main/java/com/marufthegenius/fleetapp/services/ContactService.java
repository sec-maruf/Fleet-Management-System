package com.marufthegenius.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marufthegenius.fleetapp.models.Contact;
import com.marufthegenius.fleetapp.repositories.ContactRepository;

@Service
public class ContactService {
	@Autowired
	private ContactRepository contactRepository;
		//Return a list of contacts
		public List<Contact> getContacts(){
		return contactRepository.findAll() ;
		
		}
		
		//Add a new contact
		public void save(Contact contact) {
			contactRepository.save(contact);
			
		}
		
		//get by id
		public Optional<Contact> findById(Integer id) {
			return contactRepository.findById(id);
			
		}
	   
		//Delete a Contact 
		public void delete(Integer id) {
			contactRepository.deleteById(id);
			
		}

}
