package com.marufthegenius.fleetapp.controllers;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.marufthegenius.fleetapp.services.EmployeeService;

@Controller
public class ProfileController {
   @Autowired 
   private EmployeeService employeeService;
	
   @RequestMapping(value="/profile")
   public String profile(Model model, Principal principal) { 
		
		String userName = principal.getName();
		model.addAttribute("employee", employeeService.findbyUsername(userName));
		return "profile";
		
	}
}
