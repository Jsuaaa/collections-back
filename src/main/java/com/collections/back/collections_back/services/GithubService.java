package com.collections.back.collections_back.services;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.collections.back.collections_back.request.GithubAuthRequest;

@Service
public class GithubService {

    @Autowired
    private RestTemplate restTemplate;

    public String hacerPost(String code) {
        String url = "https://github.com/login/oauth/access_token";

        // Cuerpo de la petición
        GithubAuthRequest authRequest = new GithubAuthRequest(url, url, code);

        // Encabezados
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        // Crear el request con cuerpo + headers
        HttpEntity<Map<String, String>> requestEntity = new HttpEntity<>(requestBody, headers);

        // Realizar el POST
        ResponseEntity<String> response = restTemplate.postForEntity(url, requestEntity, String.class);

        return response.getBody();
    }

}
