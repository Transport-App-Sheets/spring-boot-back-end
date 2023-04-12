package com.Driven.SchoolTransport.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.Driven.SchoolTransport.model.Child;
import com.Driven.SchoolTransport.service.ChildService;


@RestController
public class ChildController {

	@Autowired
	ChildService childService;
	
	/*
	@PostMapping("/add")
	@ResponseBody
	public Child AjouterChild(@RequestBody Child c) {
		return  childService.AjouterChild(c);
	}
/*
	
	@GetMapping("/all")
	public List< Child> getAllChild(){
		return  childService.getAllChild();
	}
*/
}
