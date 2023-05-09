package com.Driven.SchoolTransport.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.Driven.SchoolTransport.model.Child;
import com.Driven.SchoolTransport.model.Parent;
import com.Driven.SchoolTransport.repository.ChildRepository;
import com.Driven.SchoolTransport.service.ChildService;
import com.Driven.SchoolTransport.service.ParentService;

import jakarta.validation.Valid;

@CrossOrigin
@RestController
@RequestMapping("/parent")

public class ParentController {
	@Autowired
	ChildRepository  childRepo;
    @Autowired
    ParentService pService;
    
    @Autowired
    ChildService cService;

    @GetMapping("/list")
    public List<Parent> getparent() {
        return pService.getAllParent();
    }

    @GetMapping("/children")
    public List<Child> getchildrens() {
        return cService.getAllChild();
    }

    @GetMapping("/{id}/children")
    public List<Child> getchild(@PathVariable long id) {
        return cService.findChildByParentId(id);
        }
    @PostMapping("/{parentId}/addchild")
    public void addChildToParent(@PathVariable Long parentId, @Valid @RequestBody Child child) {
        pService.addChildToParent(child, parentId);
    }
  
    


    @PostMapping("{id}/updatechild")
    public Child update(@PathVariable long id,@RequestBody Child c) {
         return cService.updateChild(id,c);
       
    }

    
    @PostMapping("/{id}/deletechild")
    public void deletechild(@PathVariable long id) {
               cService.deleteChild(id);}
    
}


