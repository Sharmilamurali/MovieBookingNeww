package com.moviebooking.exception;

public class CommonException extends RuntimeException{
    private static final long serialVersionUID = 1L;
	public CommonException(){super();}
    public CommonException(String message){super(message);}
}
