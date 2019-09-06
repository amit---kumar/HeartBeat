package com.amit.heartbeat.microservices.business.onboarding.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value = "/greet")
public class GreetController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private Environment env;

    @RequestMapping(value = "/formal", method = RequestMethod.GET)
    public String formal()
    {
        return "Hi " + env.getProperty("local.server.port");
    }

    @RequestMapping(value = "/formal/search", method = RequestMethod.GET)
    public String formalLoadBalanced(@RequestHeader("Authorization") String authorization)
    {
        org.springframework.http.HttpHeaders httpHeaders = new org.springframework.http.HttpHeaders();
        String url =  "http://localhost:9180/search/profile/default";
        String headerName = "Authorization";
        httpHeaders.add(headerName, authorization);
        httpHeaders.add("Content-Type", "application/json");
        HttpEntity<String> requestEntity = new HttpEntity<>("Headers", httpHeaders);
        return "Hi " + restTemplate.exchange(url, HttpMethod.GET, requestEntity, String.class).getBody();
    }
}
