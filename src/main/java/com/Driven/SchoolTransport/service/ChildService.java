package com.Driven.SchoolTransport.service;


import java.util.List;

import com.Driven.SchoolTransport.model.Child;


public interface ChildService{
	
	

	public void DeleteChild(Child p);
	public void DeleteChild(long id);
	public List<Child> getAllChild();
	Child ajouterChild(long parentId, Child c);
	
	List<Child> findChildByParentId(long id);

}
