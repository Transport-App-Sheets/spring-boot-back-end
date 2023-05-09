package com.Driven.SchoolTransport.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.Driven.SchoolTransport.model.Child;
import com.Driven.SchoolTransport.model.Driver;

import jakarta.validation.Valid;


public interface ChildRepository extends JpaRepository<Child, Long> {

    @Query("SELECT c FROM Child c WHERE c.parent.id = :parentId")
    List<Child> findChildrenByParentId(@Param("parentId") long parentId);

    
}