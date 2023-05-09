package com.Driven.SchoolTransport.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Driven.SchoolTransport.model.School;


public interface SchoolRepository extends JpaRepository<School,Long > {

}
