package com.edufy.edufy.models;

import jakarta.persistence.*;

@Entity
public class Video {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "artist_Id")
    private Artist artist;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "genre_Id")
    private Genre genre;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "album_Id")
    private Album album;

    @Column
    private String RealeseDate;

    public Video(int id, Artist artist, Genre genre, Album album, String realeseDate) {
        this.id = id;
        this.artist = artist;
        this.genre = genre;
        this.album = album;
        RealeseDate = realeseDate;
    }

    public Video() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public String getRealeseDate() {
        return RealeseDate;
    }

    public void setRealeseDate(String realeseDate) {
        RealeseDate = realeseDate;
    }

    @Override
    public String toString() {
        return "Video{" +
                "id=" + id +
                ", artist=" + artist +
                ", genre=" + genre +
                ", album=" + album +
                ", RealeseDate='" + RealeseDate + '\'' +
                '}';
    }
}
