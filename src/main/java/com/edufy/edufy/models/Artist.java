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

    @ManyToOne
    @JoinColumn
    private Album album;

    //Constructors

    public Artist() {
    }

    public Artist(int id, String name, String genre, Album album) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.album = album;
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

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }
}
