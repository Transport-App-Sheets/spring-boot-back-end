package com.Driven.SchoolTransport.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class School {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int id;
	public String schoolname;
	public String schooladress;
	public Positions schoolposition;
	public List<Driver> wdriver;
	
	
	
	 @OneToMany(mappedBy="school")
	    private List<Child> children;
	    
	    @ManyToMany
	    @JoinTable(
	        name="driver_school",
	        joinColumns=@JoinColumn(name="school_id"),
	        inverseJoinColumns=@JoinColumn(name="driver_id")
	    )
	    private List<Driver> drivers;
	    
	    @OneToOne
	    @JoinColumn(name="position_id")
	    private Positions positions;

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

		public Positions getSchoolposition() {
			return schoolposition;
		}

		public void setSchoolposition(Positions schoolposition) {
			this.schoolposition = schoolposition;
		}

		public List<Driver> getWdriver() {
			return wdriver;
		}

		public void setWdriver(List<Driver> wdriver) {
			this.wdriver = wdriver;
		}

		public List<Child> getChildren() {
			return children;
		}

		public void setChildren(List<Child> children) {
			this.children = children;
		}

		public List<Driver> getDrivers() {
			return drivers;
		}

		public void setDrivers(List<Driver> drivers) {
			this.drivers = drivers;
		}

		public Positions getPositions() {
			return positions;
		}

		public void setPositions(Positions positions) {
			this.positions = positions;
		}

}
