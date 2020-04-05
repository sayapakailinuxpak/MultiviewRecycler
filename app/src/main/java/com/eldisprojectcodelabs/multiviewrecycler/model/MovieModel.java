package com.eldisprojectcodelabs.multiviewrecycler.model;

public class MovieModel {
    private String movieTitle;
    private String movieImageURL;

    public MovieModel(String movieTitle, String movieImageURL) {
        this.movieTitle = movieTitle;
        this.movieImageURL = movieImageURL;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public String getMovieImageURL() {
        return movieImageURL;
    }

    public void setMovieImageURL(String movieImageURL) {
        this.movieImageURL = movieImageURL;
    }
}
