package com.steinny.corrensa.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import static javax.persistence.GenerationType.IDENTITY;

public class User {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    
}
