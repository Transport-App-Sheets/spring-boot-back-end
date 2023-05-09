package com.Driven.SchoolTransport.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;





@Entity
public class Positions {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int id;
	public String longitude;
	public String latitude;
	@JsonBackReference
	@OneToMany(mappedBy = "id")
	public List<School> schools;
	@JsonBackReference
	@OneToMany(mappedBy = "id")
    public List<Driver> drivers;    
    
	 

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getLongitude() {
			return longitude;
		}

		public void setLongitude(String longitude) {
			this.longitude = longitude;
		}

		public String getLatitude() {
			return latitude;
		}

		public void setLatitude(String latitude) {
			this.latitude = latitude;
		}

		public List<School> getSchools() {
			return schools;
		}

		public void setSchools(List<School> schools) {
			this.schools = schools;
		}

		public List<Driver> getDrivers() {
			return drivers;
		}

		public void setDrivers(List<Driver> drivers) {
			this.drivers = drivers;
		}

		



	

}

	

	
