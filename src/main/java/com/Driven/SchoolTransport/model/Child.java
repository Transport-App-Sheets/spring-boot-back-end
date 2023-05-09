package com.Driven.SchoolTransport.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.Valid;




@Entity
public class Child {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idchild;
	private String lastName;
	private String firstName;
	private String age;
	private String schoolName;
	private String homeAddress;
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name="parent_id")
    private Parent parent;
	
    @JsonManagedReference
	@ManyToOne
    @JsonIgnore
    @JoinColumn(name="driver_id")
    private Driver driver;
	
	@ManyToOne
    @JsonIgnore
    @JoinColumn(name="school_id")
    private School school;

	public long getIdchild() {
		return idchild;
	}

	public void setIdchild(long idchild) {
		this.idchild = idchild;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String i) {
		this.age = i;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public void setParent(Parent parent) {
		this.parent = parent;
	}

	public String getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}

	public Parent getParent() {
		return parent;
	}

	public long setParentid(@Valid long id) {
		return this.parent.setId(id);
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}
}
	

	
