package com.Driven.SchoolTransport.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;





@Entity
public class Child {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int idchild;
	public String lastname;
	public String firstname;
	public String age;
	public String homeaddress;

	@ManyToOne
    @JoinColumn(name="parent_id")
    private Parent parent;
    
    @ManyToOne
    @JoinColumn(name="school_id")
    private School school;
    
    @ManyToOne
    @JoinColumn(name="driver_id")
    private Driver driver;
    
    @OneToOne
    @JoinColumn(name="position_id")
    public Positions positions;

	public int getIdchild() {
		return idchild;
	}

	public void setIdchild(int idchild) {
		this.idchild = idchild;
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

	public Parent getParent() {
		return parent;
	}

	public void setParent(Parent parent) {
		this.parent = parent;
	}

	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	public Positions getPositions() {
		return positions;
	}

	public void setPositions(Positions positions) {
		this.positions = positions;
	}

}

	

	
