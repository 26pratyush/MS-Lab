package com.example.Movie.controller;

import com.example.Movie.model.Movie;
import com.example.Movie.repository.MovieRepository;
import com.example.Movie.controller.MovieController;

import java.util.List;

import com.example.Movie.service.MovieService;
import org.springframework.web.bind.annotation.*;

@RestController
public class MovieController {
    private final MovieService ms;
    public MovieController(MovieService ms){
        this.ms = ms;
    }

    @PostMapping("/createMovie")
    public Movie createMovie(@RequestBody Movie movie){
        return ms.create(movie);
    }

    @GetMapping("/getAllMovies")
    public List<Movie> getAllMovies(){
        return ms.findAll();
    }

    @GetMapping("/get/{id}")
    public Movie findMovieById(@PathVariable int id){
        return ms.findById(id);
    }

    @DeleteMapping("/deleteAll")
    public String deleteAll(){
        ms.deleteAll();
        return "Deleted all movies";
    }
    @DeleteMapping("/deleteMovie/{id}")
    public String deleteById(@PathVariable int id) {
        ms.deleteById(id);
        return "Movie Deleted";
    }

    @PutMapping("/updateMovie/{id}")
    public Movie updateMovie(@PathVariable int id, @RequestBody Movie movie){
        return ms.update(id,movie);
    }
}
