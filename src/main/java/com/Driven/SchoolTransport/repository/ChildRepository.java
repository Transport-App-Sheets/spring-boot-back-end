package com.Driven.SchoolTransport.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Driven.SchoolTransport.model.Child;
@Repository
public interface ChildRepository extends JpaRepository<Child,Long > {

}
