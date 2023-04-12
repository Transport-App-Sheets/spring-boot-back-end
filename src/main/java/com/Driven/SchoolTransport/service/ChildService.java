package com.Driven.SchoolTransport.service;


import java.util.List;


import com.Driven.SchoolTransport.model.Child;


public interface ChildService{
	
	

	public void DeleteChild(Child p);
	public void DeleteChild(Long id);
	public List<Child> getAllChild();
	public Child AjouterChild(Child c);
	Child ajouterChild(Long parentId, Child c);
	

}
