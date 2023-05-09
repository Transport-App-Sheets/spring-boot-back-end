package com.Driven.SchoolTransport.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.Driven.SchoolTransport.model.Driver;
import com.Driven.SchoolTransport.service.DriverService;
@CrossOrigin
@RestController
@RequestMapping("/drivers")

public class DriverController {
    @Autowired
    DriverService dService;
  
    @GetMapping("/listdrivers")
    public List<Driver> getdriver() {
        return dService.getAllDrivers();
    }

    
}
