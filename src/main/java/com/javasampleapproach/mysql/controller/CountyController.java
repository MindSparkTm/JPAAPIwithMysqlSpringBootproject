package com.javasampleapproach.mysql.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javasampleapproach.mysql.model.County;
import com.javasampleapproach.mysql.model.Customer;
import com.javasampleapproach.mysql.repo.CountyRepository;

@RestController
public class CountyController {
	@Autowired
	CountyRepository repository;
	
	
	@RequestMapping("/savecounty")
	public String process(){
		repository.save(new County("50","Safaripark","Nairobi"));
		
		
		return "Done";
	}
	
	@RequestMapping("/findallcounty")
	public String findAll(){
		String result = "<html>";
		
		for(County cu : repository.findAll()){
			result += "<div>" + cu.toString() + "</div>";
		}
		
		return result + "</html>";
	}
	
	
	
	
	
}
