package com.Driven.SchoolTransport.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;
import com.Driven.SchoolTransport.model.Child;
import com.Driven.SchoolTransport.model.Parent;
import com.Driven.SchoolTransport.service.ParentService;

@CrossOrigin
@RestController
public class ParentController {

	@Autowired
	ParentService parentService;
	
/*
	@PostMapping("/register")
	@ResponseBody
	public Parent AjouterParent(@RequestBody Long id,Parent c) {
		return parentService.AjouterParent(c);
	}
	*/
	@PostMapping("/addchild")
	public Child AjouterChild(@RequestBody long id,Child c) {
		return parentService.ajouterChild(id, c);
	}


	@GetMapping("/all")
	public List<Parent> getAllParent(){
		return parentService.getAllParent();
	}

}
