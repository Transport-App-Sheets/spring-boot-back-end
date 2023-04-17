package com.Driven.SchoolTransport.service;


import java.util.List;


import com.Driven.SchoolTransport.model.Child;
import com.Driven.SchoolTransport.model.Parent;


public interface ParentService {
	
	
	public Parent AjouterParent(Parent p);
	public void DeleteParent(Parent p);
	public void DeleteParent(long id);
	public List<Parent> getAllParent();
	Child ajouterChild(long parentId, Child c);
	public Parent FindParentByid(long parentId);

}
