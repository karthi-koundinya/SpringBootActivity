package com.ltts.movieapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ltts.movieapp.bo.MovieBo;
import com.ltts.movieapp.model.Movie;

@Service
public class MovieServiceImp implements MovieService{

	@Autowired
    private MovieBo mv;
	
	@Override
	public void save(Movie id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Movie findMovieById(int id) {
		// TODO Auto-generated method stub
		return mv.findMovieById(id);
	}

	@Override
	public List<Movie> findAll() {
		// TODO Auto-generated method stub
		return mv.findAll();
	}

}
