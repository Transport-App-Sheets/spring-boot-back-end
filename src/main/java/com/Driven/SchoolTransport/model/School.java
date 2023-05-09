package com.Driven.SchoolTransport.model;

import java.util.List;


import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

import jakarta.persistence.OneToOne;


@Entity
public class School {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int id;
	public String schoolname;
	public String schooladress;
	@ManyToMany
    @JoinTable(
        name = "school_driver",
        joinColumns = @JoinColumn(name = "school_id"),
        inverseJoinColumns = @JoinColumn(name = "driver_id")
    )
	 private List<Driver> drivers;
	@JsonManagedReference
	@OneToOne
    @JoinColumn(name="position_id")
    private Positions position;
	
   
	    

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getSchoolname() {
			return schoolname;
		}

		public void setSchoolname(String schoolname) {
			this.schoolname = schoolname;
		}

		public String getSchooladress() {
			return schooladress;
		}

		public void setSchooladress(String schooladress) {
			this.schooladress = schooladress;
		}

		public List<Driver> getDrivers() {
			return drivers;
		}

		public void setDrivers(List<Driver> drivers) {
			this.drivers = drivers;
		}

		public Positions getPosition() {
			return position;
		}

		public void setPosition(Positions position) {
			this.position = position;
		}

		

		
	

		

		


}
