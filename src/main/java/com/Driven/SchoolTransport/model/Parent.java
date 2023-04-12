package com.Driven.SchoolTransport.model;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;





@Entity
public class Parent {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int id;
	public String login;
	public String password;
	
    @OneToMany(mappedBy = "idchild")
	public List<Child> child;
	public int getId() {
	
	
	return id;

}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setId(int id) {
		this.id = id;
	}

}

	

	
