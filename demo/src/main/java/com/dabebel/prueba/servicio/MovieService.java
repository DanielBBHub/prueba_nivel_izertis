package com.dabebel.prueba.servicio;

import com.dabebel.prueba.modelo.Model;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MovieService {

    @Value("${tmdb.api.key}")
    private String apiKey;

    @Value("${tmdb.api.url}")
    private String apiUrl;

    private final RestTemplate restTemplate;

    public MovieService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Model searchMovies(String query) {
        String url = String.format("%s?api_key=%s&query=%s", apiUrl, apiKey, query);
        return restTemplate.getForObject(url, Model.class);
    }
}
