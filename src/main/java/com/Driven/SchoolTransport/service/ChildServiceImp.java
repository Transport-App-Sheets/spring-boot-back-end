package com.Driven.SchoolTransport.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Driven.SchoolTransport.model.Child;
import com.Driven.SchoolTransport.model.Parent;
import com.Driven.SchoolTransport.repository.ChildRepository;
import com.Driven.SchoolTransport.repository.DriverRepository;
import com.Driven.SchoolTransport.repository.ParentRepository;

import jakarta.validation.Valid;
import spring.ateliers.g4.atelier1.model.ProjeDev;
import spring.ateliers.g4.atelier1.model.Tache;

@Service
public class ChildServiceImp implements ChildService{
	
@Autowired
ChildRepository  childRepo;
@Autowired
ParentRepository parentRepo;
DriverRepository driverRepo;

@Override
public List<Child> getAllChild() {
    return childRepo.findAll();

}


@Override
public List<Child> findChildByParentId(long id) {
	return childRepo.findChildrenByParentId(id);
}

@Override
public void deleteChild(long id){	
	
	childRepo.deleteById(id);


}





public Child updateChild(Long childId, @Valid Child updatedChild) {
    Child child = childRepo.findById(childId).orElseThrow(() -> new RuntimeException("Child not found"));

    child.setLastName(updatedChild.getLastName());
	child.setFirstName(updatedChild.getFirstName());
	child.setAge(updatedChild.getAge());
	child.setSchoolName(updatedChild.getSchoolName());
	child.setHomeAddress(updatedChild.getHomeAddress());
    return childRepo.save(child);
}









}


