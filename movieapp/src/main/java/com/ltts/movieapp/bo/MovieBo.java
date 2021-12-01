package com.ltts.movieapp.bo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.ltts.movieapp.model.Movie;

@Repository
@EnableJpaRepositories
public interface MovieBo extends JpaRepository<Movie,String>{

	Movie findMovieById(int id);

}
