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

import com.marufthegenius.fleetapp.models.VehicleMaintenance;
import com.marufthegenius.fleetapp.models.Country;
import com.marufthegenius.fleetapp.models.State;
import com.marufthegenius.fleetapp.services.VehicleMaintenanceService;
import com.marufthegenius.fleetapp.services.VehicleService;
import com.marufthegenius.fleetapp.services.CountryService;
import com.marufthegenius.fleetapp.services.StateService;
import com.marufthegenius.fleetapp.services.SupplierService;

@Controller
public class VehicleMaintenanceController {
	@Autowired
	private  VehicleMaintenanceService  vehicleMaintenanceService;
	
	@Autowired
	private  VehicleService  vehicleService ;
	@Autowired
	private  SupplierService  supplierService ;
	
	
	    
	    @GetMapping("/vehicleMaintenances")
		public String getVehicleMaintenances(Model model ) {
	
			List<VehicleMaintenance> vehicleMaintenanceList = vehicleMaintenanceService.getVehicleMaintenances();
			model.addAttribute("vehicleMaintenances", vehicleMaintenanceList);
			model.addAttribute("suppliers", supplierService.getSuppliers());
			model.addAttribute("vehicles", vehicleService.getVehicles());
			
			return "VehicleMaintenance";
		}
	    
      @PostMapping("/vehicleMaintenances/addNew") 
	  public String addNew(VehicleMaintenance vehicleMaintenance) {
		  vehicleMaintenanceService.save(vehicleMaintenance);
		  return "redirect:/vehicleMaintenances";
		  } 
      
      
      @RequestMapping("vehicleMaintenances/findById")
      @ResponseBody
      public Optional<VehicleMaintenance> findById(Integer id) {
    	 return vehicleMaintenanceService.findById(id);
    	  
      }
      
      @RequestMapping(value= "/vehicleMaintenances/update", method= {RequestMethod.PUT,RequestMethod.GET})
      public String update(VehicleMaintenance vehicleMaintenance) {
		  vehicleMaintenanceService.save(vehicleMaintenance);
		  return "redirect:/vehicleMaintenances";
		  }
      
      @RequestMapping(value= "/vehicleMaintenances/delete", method= {RequestMethod.DELETE,RequestMethod.GET})
      public String delete(Integer id) {
		  vehicleMaintenanceService.delete(id);
		  return "redirect:/vehicleMaintenances";
		  } 
	

}
