package com.edufy.edufy.models;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "music")
public class Music extends Media {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;






    public Music() {
    }


    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
