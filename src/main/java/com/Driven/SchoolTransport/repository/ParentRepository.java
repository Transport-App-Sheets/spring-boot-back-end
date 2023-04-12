package com.Driven.SchoolTransport.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Driven.SchoolTransport.model.Parent;
@Repository
public interface ParentRepository extends JpaRepository<Parent,Long > {

}
