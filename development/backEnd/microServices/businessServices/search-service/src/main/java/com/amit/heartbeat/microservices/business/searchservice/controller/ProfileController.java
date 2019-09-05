package com.amit.heartbeat.microservices.business.searchservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/profile")
public class ProfileController {

    @RequestMapping(value = "/default", method = RequestMethod.GET)
    public String getDefaultEmployee()
    {
        return "Amit";
    }
}
