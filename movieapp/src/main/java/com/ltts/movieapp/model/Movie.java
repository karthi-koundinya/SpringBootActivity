package com.ltts.movieapp.model;



import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Movie {

	@Id
	private int movieId;
	private String movieName;
	private String director;
	private String heroName;
	private String Heroin;
	private String language;
	private Date releaseDate;
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getHeroName() {
		return heroName;
	}
	public void setHeroName(String heroName) {
		this.heroName = heroName;
	}
	public String getHeroin() {
		return Heroin;
	}
	public void setHeroin(String heroin) {
		Heroin = heroin;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public Date getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	
	public Movie(int movieId, String movieName, String director, String heroName, String heroin, String language,
			Date releaseDate) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.director = director;
		this.heroName = heroName;
		Heroin = heroin;
		this.language = language;
		this.releaseDate = releaseDate;
	}
	
	public Movie() {
		super();
	}
	
	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", director=" + director + ", heroName="
				+ heroName + ", Heroin=" + Heroin + ", language=" + language + ", releaseDate=" + releaseDate + "]";
	}
		
}
