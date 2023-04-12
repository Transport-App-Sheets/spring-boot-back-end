package com.Driven.SchoolTransport.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Driven.SchoolTransport.model.Child;
import com.Driven.SchoolTransport.repository.ChildRepository;
import com.Driven.SchoolTransport.repository.ParentRepository;

@Service
public class ChildServiceImp implements ChildService{
	
@Autowired
ChildRepository  childRepo;
ParentRepository parentReo;
	

@Override
public void DeleteChild(Child p) {
	childRepo.delete(p);
	
}

@Override
public List<Child> getAllChild() {
	
	return (List<Child>) childRepo.findAll();
}

@Override
public void DeleteChild(Long id) {
	childRepo.deleteById(id);
}

@Override
public Child ajouterChild(Long parentId, Child c) {
	Parent parent = parentRepo.findById(parentId).orElseThrow(() -> new IllegalArgumentException("Invalid parent ID"));
	return childRepo.save(c);}

}

