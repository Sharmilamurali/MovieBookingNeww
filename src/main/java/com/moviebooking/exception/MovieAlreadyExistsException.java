package com.moviebooking.exception;

@SuppressWarnings("serial")
public class MovieAlreadyExistsException extends RuntimeException{
    public MovieAlreadyExistsException(){super();}
    public MovieAlreadyExistsException(String message){super(message);}
}
