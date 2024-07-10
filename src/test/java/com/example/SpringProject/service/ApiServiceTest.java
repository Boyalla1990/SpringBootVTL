package com.example.SpringProject.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
@SpringBootTest
public class ApiServiceTest {

    @Mock
    private RestTemplate restTemplate;

    @InjectMocks
    private ApiService apiService;

    @Test
    public void testGetApiData() {
        String expectedResponse = "some data";
        String apiUrl = "https://api.example.com/data";

        when(restTemplate.getForObject(apiUrl, String.class)).thenReturn(expectedResponse);

        String actualResponse = apiService.getApiData();
        assertEquals(expectedResponse, actualResponse);
    }
}
