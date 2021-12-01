package com.ltts.movieapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ltts.movieapp.model.Movie;

@Service
public interface MovieService {

void save(Movie id);
	
	public Movie findMovieById(int id);

	public List<Movie> findAll();
}
