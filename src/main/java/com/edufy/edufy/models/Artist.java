package com.edufy.edufy.models;


import jakarta.persistence.*;

@Table(name = "artists")
@Entity
public class Artist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "artist_id", nullable = false)
    private int id;

    @Column(name = "artist_name")
    private String name;

    @Column(name = "artist_genre")
    private String genre;

    //Constructors

    public Artist() {
    }

    public Artist(String name, String genre) {
        this.name = name;
        this.genre = genre;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
