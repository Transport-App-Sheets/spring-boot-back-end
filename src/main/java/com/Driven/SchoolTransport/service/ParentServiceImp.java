package com.Driven.SchoolTransport.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

import com.Driven.SchoolTransport.model.Child;
import com.Driven.SchoolTransport.model.Parent;
import com.Driven.SchoolTransport.repository.ChildRepository;
import com.Driven.SchoolTransport.repository.DriverRepository;
import com.Driven.SchoolTransport.repository.ParentRepository;

import jakarta.validation.Valid;


@Service
public class ParentServiceImp implements ParentService{
	
@Autowired
ParentRepository  parentRepo;
@Autowired
ChildRepository  childRepo;
DriverRepository  driverRepo;

@Override
public void DeleteParent(Parent p) {
	parentRepo.delete(p);
	
}
@Override
public void DeleteParent(long id) {
	parentRepo.deleteById(id);
	
}
@Override
public List<Parent> getAllParent() {
	
	return parentRepo.findAll();
}


public List<Child> getAllChild() {
	
	return childRepo.findAll();
}
@Override
public void ajouter(Parent p) {
    parentRepo.save(p);	
}






public void addChildToParent(@Valid Child child, Long parentId) {
    Parent parent = parentRepo.findById(parentId).orElseThrow(() -> new RuntimeException("Parent not found"));
    child.setParent(parent);
    childRepo.save(child);
}



}




	

