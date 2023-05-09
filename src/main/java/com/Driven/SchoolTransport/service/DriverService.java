package com.Driven.SchoolTransport.service;

import java.util.List;
import java.util.Optional;

import com.Driven.SchoolTransport.model.Driver;

public interface DriverService {
public List<Driver> getAllDrivers();

public Optional<Driver> finddriver(Object driverid);


}
