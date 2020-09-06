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

import com.marufthegenius.fleetapp.models.Supplier;
import com.marufthegenius.fleetapp.models.Country;
import com.marufthegenius.fleetapp.models.State;
import com.marufthegenius.fleetapp.services.SupplierService;
import com.marufthegenius.fleetapp.services.CountryService;
import com.marufthegenius.fleetapp.services.StateService;

@Controller
public class SupplierController {
	@Autowired
	private  SupplierService  supplierService;
	
	@Autowired
	private  CountryService  countryService;
	
	@Autowired
	private  StateService  stateService;
	    
	    @GetMapping("/suppliers")
		public String getSuppliers(Model model ) {
	
			List<Supplier> supplierList = supplierService.getSuppliers();
			model.addAttribute("suppliers", supplierList);
			List<Country> countryList = countryService.getCountries();
			model.addAttribute("countries", countryList);
			List <State> stateList = stateService.getStates();
			model.addAttribute("states", stateList);
			
			return "Supplier";
		}
	    
      @PostMapping("/suppliers/addNew") 
	  public String addNew(Supplier supplier) {
		  supplierService.save(supplier);
		  return "redirect:/suppliers";
		  } 
      
      
      @RequestMapping("suppliers/findById")
      @ResponseBody
      public Optional<Supplier> findById(Integer id) {
    	 return supplierService.findById(id);
    	  
      }
      
      @RequestMapping(value= "/suppliers/update", method= {RequestMethod.PUT,RequestMethod.GET})
      public String update(Supplier supplier) {
		  supplierService.save(supplier);
		  return "redirect:/suppliers";
		  }
      
      @RequestMapping(value= "/suppliers/delete", method= {RequestMethod.DELETE,RequestMethod.GET})
      public String delete(Integer id) {
		  supplierService.delete(id);
		  return "redirect:/suppliers";
		  }

}
