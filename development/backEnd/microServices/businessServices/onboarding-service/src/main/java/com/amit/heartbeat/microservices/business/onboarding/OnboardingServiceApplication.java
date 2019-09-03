package com.amit.heartbeat.microservices.business.onboarding;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
@EnableResourceServer
@EnableOAuth2Client
@EnableFeignClients
public class OnboardingServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(OnboardingServiceApplication.class, args);
    }


/*    @Configuration
    class Config
    {
        @LoadBalanced
        @Bean
        public RestTemplate restTemplate()
        {
            return new RestTemplate();
        }
    }*/
}
