package com.example.Movie.service;

import com.example.Movie.model.Movie;
import com.example.Movie.repository.MovieRepository;
import com.example.Movie.controller.MovieController;

import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class MovieService{
    private final MovieRepository mr;
    public MovieService(MovieRepository mr){
        this.mr=mr;
    }

    public Movie create(Movie movie){
        return mr.save(movie);
    }

    public List<Movie> findAll(){
        return mr.findAll();
    }
    public Movie findById(int id){
        return mr.findById(id).orElse(null);
    }

    public String deleteAll(){
        mr.deleteAll();
        return "All Movies Deleted!";
    }
    public String deleteById(int id){
        mr.deleteById(id);
        return "Movie Deleted Successfully!";
    }

    public Movie update(int id, Movie newdata){
        Movie movie=mr.findById(id).get();
        movie.setTitle(newdata.getTitle());
        movie.setPrice(newdata.getPrice());
        return mr.save(movie);
    }
}