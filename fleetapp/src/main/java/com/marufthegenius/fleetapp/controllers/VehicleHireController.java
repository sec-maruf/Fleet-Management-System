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

import com.marufthegenius.fleetapp.models.VehicleHire;
import com.marufthegenius.fleetapp.models.Country;
import com.marufthegenius.fleetapp.models.State;
import com.marufthegenius.fleetapp.services.VehicleHireService;
import com.marufthegenius.fleetapp.services.VehicleService;
import com.marufthegenius.fleetapp.services.ClientService;
import com.marufthegenius.fleetapp.services.CountryService;
import com.marufthegenius.fleetapp.services.LocationService;
import com.marufthegenius.fleetapp.services.StateService;

@Controller
public class VehicleHireController {
	@Autowired
	private  ClientService  clientService;
	
	@Autowired
	private  VehicleHireService  vehicleHireService;
	
	@Autowired
	private  LocationService  locationService;
	
	@Autowired
	private  VehicleService  vehicleService;
	    
	    @GetMapping("/vehicleHires")
		public String getVehicleHires(Model model ) {
	
			List<VehicleHire> vehicleHireList = vehicleHireService.getVehicleHires();
			model.addAttribute("vehicleHires", vehicleHireList);
			model.addAttribute("locations", locationService.getLocations());
			model.addAttribute("vehicles",vehicleService.getVehicles());
			model.addAttribute("clients",clientService.getClients());
			
			return "VehicleHire";
		}
	    
      @PostMapping("/vehicleHires/addNew") 
	  public String addNew(VehicleHire vehicleHire) {
		  vehicleHireService.save(vehicleHire);
		  return "redirect:/vehicleHires";
		  } 
      
      
      @RequestMapping("vehicleHires/findById")
      @ResponseBody
      public Optional<VehicleHire> findById(Integer id) {
    	 return vehicleHireService.findById(id);
    	  
      }
      
      @RequestMapping(value= "/vehicleHires/update", method= {RequestMethod.PUT,RequestMethod.GET})
      public String update(VehicleHire vehicleHire) {
		  vehicleHireService.save(vehicleHire);
		  return "redirect:/vehicleHires";
		  }
      
      @RequestMapping(value= "/vehicleHires/delete", method= {RequestMethod.DELETE,RequestMethod.GET})
      public String delete(Integer id) {
		  vehicleHireService.delete(id);
		  return "redirect:/vehicleHires";
		  } 

}
