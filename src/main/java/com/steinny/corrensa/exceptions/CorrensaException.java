package com.steinny.corrensa.exceptions;

import java.security.GeneralSecurityException;

public class CorrensaException extends RuntimeException {

    public CorrensaException(String exMessage, GeneralSecurityException e) {
        super(exMessage);
    }
}
