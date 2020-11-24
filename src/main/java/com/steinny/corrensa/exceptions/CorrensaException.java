package com.steinny.corrensa.exceptions;

import lombok.AllArgsConstructor;

import java.security.GeneralSecurityException;
@AllArgsConstructor

public class CorrensaException extends RuntimeException {

    public CorrensaException(String exMessage, GeneralSecurityException e) {
        super(exMessage);
    }

    public CorrensaException(String s) {

    }
}
