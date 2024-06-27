package com.dabebel.prueba.controlador;

import com.dabebel.prueba.modelo.Model;
import com.dabebel.prueba.servicio.MovieService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private final MovieService movieService;

    public Controller(MovieService movieService) {
        this.movieService = movieService;
    }

    @PostMapping("/peliculas")
    public Model getMovies(@RequestParam("pelicula") String name) {
        return movieService.searchMovies(name);
    }
}
