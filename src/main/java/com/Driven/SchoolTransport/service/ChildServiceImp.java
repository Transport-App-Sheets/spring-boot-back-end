package com.Driven.SchoolTransport.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Driven.SchoolTransport.model.Child;
import com.Driven.SchoolTransport.model.Parent;
import com.Driven.SchoolTransport.repository.ChildRepository;
import com.Driven.SchoolTransport.repository.ParentRepository;

@Service
public class ChildServiceImp implements ChildService{
	
@Autowired
ChildRepository  childRepo;
ParentRepository parentRepo;
	

@Override
public void DeleteChild(Child p) {
	childRepo.delete(p);
	
}

@Override
public List<Child> getAllChild() {
	
	return (List<Child>) childRepo.findAll();
}

@Override
public void DeleteChild(long id) {
	childRepo.deleteById(id);
}

@Override
public Child ajouterChild(long parentId, Child c) {
	return childRepo.save(c);}

@Override
public List<Child> findChildByParentId(long id) {
	return childRepo.findChildByParentId(id);
}


}



