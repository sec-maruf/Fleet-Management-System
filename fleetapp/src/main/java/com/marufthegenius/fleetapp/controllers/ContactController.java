package com.marufthegenius.fleetapp.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.marufthegenius.fleetapp.models.Contact;
import com.marufthegenius.fleetapp.models.Country;
import com.marufthegenius.fleetapp.models.State;
import com.marufthegenius.fleetapp.services.ContactService;
import com.marufthegenius.fleetapp.services.CountryService;
import com.marufthegenius.fleetapp.services.StateService;

@Controller
public class ContactController {
	@Autowired
	private  ContactService  contactService;
	
	@Autowired
	private  CountryService  countryService;
	
	@Autowired
	private  StateService  stateService;
	    
	    @GetMapping("/contacts")
		public String getContacts(Model model ) {
	
			List<Contact> contactList = contactService.getContacts();
			model.addAttribute("contacts", contactList);
			List<Country> countryList = countryService.getCountries();
			model.addAttribute("countries", countryList);
			List <State> stateList = stateService.getStates();
			model.addAttribute("states", stateList);
			
			return "Contact";
		}
	    
      @PostMapping("/contacts/addNew") 
	  public String addNew(Contact contact) {
		  contactService.save(contact);
		  return "redirect:/contacts";
		  } 
      
      
      @RequestMapping("contacts/findById")
      @ResponseBody
      public Optional<Contact> findById(Integer id) {
    	 return contactService.findById(id);
    	  
      }
      
      @RequestMapping(value= "/contacts/update", method= {RequestMethod.PUT,RequestMethod.GET})
      public String update(Contact contact) {
		  contactService.save(contact);
		  return "redirect:/contacts";
		  }
      
      @RequestMapping(value= "/contacts/delete", method= {RequestMethod.DELETE,RequestMethod.GET})
      public String delete(Integer id) {
		  contactService.delete(id);
		  return "redirect:/contacts";
		  }
}
