package com.Driven.SchoolTransport.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.Driven.SchoolTransport.model.Child;
public interface ChildRepository extends JpaRepository<Child,Long > {
@Query("select c from Child c where c.parent.id=:id")
List<Child> findChildByParentId(@Param("id") long id);
}
