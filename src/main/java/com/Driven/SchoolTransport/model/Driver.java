package com.Driven.SchoolTransport.model;


import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;


@Entity
public class Driver {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int id;
	public String lastname;
	public String firstname;
	public String email;
	public String Adress;
	public String busnumber;
	
    
    @OneToMany(mappedBy="driver")
    private List<Child> children;
    
    @ManyToMany(mappedBy="drivers")
    private List<School> schools;
    
    @OneToOne
    @JoinColumn(name="position_id")
    public Positions positions;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAdress() {
		return Adress;
	}

	public void setAdress(String adress) {
		Adress = adress;
	}

	public String getBusnumber() {
		return busnumber;
	}

	public void setBusnumber(String busnumber) {
		this.busnumber = busnumber;
	}

	public List<Child> getChildren() {
		return children;
	}

	public void setChildren(List<Child> children) {
		this.children = children;
	}

	public List<School> getSchools() {
		return schools;
	}

	public void setSchools(List<School> schools) {
		this.schools = schools;
	}

	public Positions getPositions() {
		return positions;
	}

	public void setPositions(Positions positions) {
		this.positions = positions;
	}
    
	
	

}
