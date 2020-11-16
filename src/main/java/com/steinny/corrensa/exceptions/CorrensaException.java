package com.steinny.corrensa.exceptions;

public class CorrensaException extends RuntimeException {

    public CorrensaException(String exMessage, Exception exception) {
        super(exMessage, exception);
    }
    public CorrensaException(String exMessage) {
        super(exMessage);
    }
}
