package com.Driven.SchoolTransport.service;



import java.util.List;

import com.Driven.SchoolTransport.model.Child;

import jakarta.validation.Valid;




public interface ChildService{
	List<Child> getAllChild();
	List<Child> findChildByParentId(long id);
	void deleteChild(long id);
	public Child updateChild(Long childId, @Valid Child updatedChild);