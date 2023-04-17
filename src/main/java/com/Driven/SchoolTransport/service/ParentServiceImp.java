package com.Driven.SchoolTransport.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Driven.SchoolTransport.model.Child;
import com.Driven.SchoolTransport.model.Parent;
import com.Driven.SchoolTransport.repository.ChildRepository;
import com.Driven.SchoolTransport.repository.ParentRepository;

@Service
public class ParentServiceImp implements ParentService{
	
@Autowired
 ParentRepository  parentRepo;
ChildRepository  childRepo;

@Override
public Parent AjouterParent(Parent p) {
	return parentRepo.save(p);
	
}
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
	
	return (List<Parent>) parentRepo.findAll();
}
@Override

public Child ajouterChild(long parentId, Child c) {
	return childRepo.save(c);


}
@Override
public Parent FindParentByid(long parentId) {
	 parentRepo.findById(parentId);
	return null;
}}
