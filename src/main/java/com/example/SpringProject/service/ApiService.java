package com.example.SpringProject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ApiService {

    @Autowired
    private RestTemplate restTemplate;

    public String getApiData() {
        String apiUrl = "https://api.example.com/data";
        return restTemplate.getForObject(apiUrl, String.class);
    }
}
