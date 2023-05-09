package com.Driven.SchoolTransport.service;


import java.util.List;


import com.Driven.SchoolTransport.model.Child;
import com.Driven.SchoolTransport.model.Parent;

import jakarta.validation.Valid;


public interface ParentService {

	
	public void DeleteParent(Parent p);
	public void DeleteParent(long id);
	public List<Parent> getAllParent();
	void ajouter(Parent p);
	public void addChildToParent(@Valid Child child, Long parentId);       

}
