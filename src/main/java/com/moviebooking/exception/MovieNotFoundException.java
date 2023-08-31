package com.moviebooking.exception;

@SuppressWarnings("serial")
public class MovieNotFoundException extends RuntimeException{
    public MovieNotFoundException(){super();}
    public MovieNotFoundException(String message){super(message);}
}
