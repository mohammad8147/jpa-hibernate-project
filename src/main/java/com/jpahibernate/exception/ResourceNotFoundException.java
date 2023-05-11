package com.jpahibernate.exception;

public class ResourceNotFoundException extends RuntimeException{
    private final static long serialVersionUID=1l;

    public ResourceNotFoundException(String message){
        super(message);
    }


}
