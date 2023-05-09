package com.Driven.SchoolTransport.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Driven.SchoolTransport.model.Driver;
import com.Driven.SchoolTransport.repository.DriverRepository;
@Service

public class DriverServiceImp implements DriverService {
	
@Autowired 
DriverRepository driverRepo;


@Override
public List<Driver> getAllDrivers(){
 return driverRepo.findAll();
	}


@Override
public Optional<Driver> finddriver(Object driverid) {
	return driverRepo.findById((Long) driverid);
}

	



}
