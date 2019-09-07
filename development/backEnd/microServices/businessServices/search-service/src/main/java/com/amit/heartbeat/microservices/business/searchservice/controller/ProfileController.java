package com.amit.heartbeat.microservices.business.searchservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/profile")
public class ProfileController {

    @Autowired
    private Environment env;

    @RequestMapping(value = "/default", method = RequestMethod.GET)
    public String getDefaultEmployee()
    {
        System.out.println("======Time Taken=========== : " + System.currentTimeMillis());
        return "Amit" + env.getProperty("local.server.port");
    }
}
