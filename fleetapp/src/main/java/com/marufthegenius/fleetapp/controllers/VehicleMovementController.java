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

import com.marufthegenius.fleetapp.models.VehicleMovement;
import com.marufthegenius.fleetapp.models.Country;
import com.marufthegenius.fleetapp.models.State;
import com.marufthegenius.fleetapp.services.VehicleMovementService;
import com.marufthegenius.fleetapp.services.VehicleService;
import com.marufthegenius.fleetapp.services.CountryService;
import com.marufthegenius.fleetapp.services.LocationService;
import com.marufthegenius.fleetapp.services.StateService;

@Controller
public class VehicleMovementController {
	@Autowired
	private  VehicleMovementService  vehicleMovementService;
	
	@Autowired
	private  VehicleService  vehicleService ;
	@Autowired
	private  LocationService locationService;
	    
	    @GetMapping("/vehicleMovements")
		public String getVehicleMovements(Model model ) {
	
			List<VehicleMovement> vehicleMovementList = vehicleMovementService.getVehicleMovements();
			model.addAttribute("vehicleMovements", vehicleMovementList);
			model.addAttribute("vehicles", vehicleService.getVehicles());
			model.addAttribute("locations", locationService.getLocations());
			return "VehicleMovement";
		}
	    
      @PostMapping("/vehicleMovements/addNew") 
	  public String addNew(VehicleMovement vehicleMovement) {
		  vehicleMovementService.save(vehicleMovement);
		  return "redirect:/vehicleMovements";
		  } 
      
      
      @RequestMapping("vehicleMovements/findById")
      @ResponseBody
      public Optional<VehicleMovement> findById(Integer id) {
    	 return vehicleMovementService.findById(id);
    	  
      }
      
      @RequestMapping(value= "/vehicleMovements/update", method= {RequestMethod.PUT,RequestMethod.GET})
      public String update(VehicleMovement vehicleMovement) {
		  vehicleMovementService.save(vehicleMovement);
		  return "redirect:/vehicleMovements";
		  }
      
      @RequestMapping(value= "/vehicleMovements/delete", method= {RequestMethod.DELETE,RequestMethod.GET})
      public String delete(Integer id) {
		  vehicleMovementService.delete(id);
		  return "redirect:/vehicleMovements";
		  } 
}
