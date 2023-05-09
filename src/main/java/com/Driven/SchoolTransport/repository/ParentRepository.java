package com.Driven.SchoolTransport.repository;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.Driven.SchoolTransport.model.Child;
import com.Driven.SchoolTransport.model.Driver;
import com.Driven.SchoolTransport.model.Parent;

import spring.ateliers.g4.atelier1.model.ProjeDev;


public interface ParentRepository extends JpaRepository<Parent, Long> {

	Optional<Parent> findById(int id);
	@Query("Select p from Parent p where p.id=:idP")
	Parent getparent(@Param("idP")long id);

}
