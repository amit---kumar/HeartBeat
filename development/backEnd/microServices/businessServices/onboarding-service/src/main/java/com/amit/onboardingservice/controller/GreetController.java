package com.amit.onboardingservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value = "/greet")
public class GreetController {

//    @Autowired
//    private RestTemplate restTemplate;

    @RequestMapping(value = "/formal", method = RequestMethod.GET)
    public String formal()
    {
        return "Hi ";
    }

//    @RequestMapping(value = "/formal/loadbalanced", method = RequestMethod.GET)
//    public String formalLoadBalanced()
//    {
//        String url =  "http://SEARCH/profile/default";
//        return "Hi " + restTemplate.getForObject(url,String.class);
//    }
}
