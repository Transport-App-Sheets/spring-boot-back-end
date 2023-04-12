package com.Driven.SchoolTransport.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;





@Entity
public class Child {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int idchild;
	public String lastname;
	public String firstname;
	public String schooltname;
	public String age;
	public String homeaddress;
	   @ManyToOne
	    @JoinColumn(name = "idparent")
	    private Parent parent;
	public int getId() {
		return idchild;
	}
	public void setId(int id) {
		this.idchild = id;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getSchooltname() {
		return schooltname;
	}
	public void setSchooltname(String schooltname) {
		this.schooltname = schooltname;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getHomeaddress() {
		return homeaddress;
	}
	public void setHomeaddress(String homeaddress) {
		this.homeaddress = homeaddress;
	}

	

}

	

	
