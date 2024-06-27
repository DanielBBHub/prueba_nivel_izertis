package com.dabebel.prueba.modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Model {
    private Integer page;
    private List<Movie> results;

    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Movie {
        private String title;
        private String overview;
        @JsonProperty("release_date")
        private String releaseDate;
    }
}
