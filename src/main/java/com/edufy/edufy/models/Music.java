package com.edufy.edufy.models;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Music { // TODO EXTENDS MEDIA <-------------------------------

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;




    public Music() {
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


}
