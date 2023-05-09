package com.Driven.SchoolTransport.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.Driven.SchoolTransport.model.Driver;

public interface DriverRepository extends JpaRepository<Driver,Long > {
/*	@Query("SELECT d FROM Driver d JOIN JOIN parent p ON d.parent_id = p.id")
    List<Driver> finddriverofparent(@Param("Id") long Id);*/
}
