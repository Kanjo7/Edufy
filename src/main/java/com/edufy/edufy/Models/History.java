package com.edufy.edufy.models;


import jakarta.persistence.*;

@MappedSuperclass
public abstract class History {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    @ManyToOne
    @JoinColumn(name = "genre_id")
    private Genre genre;

    @ManyToOne(targetEntity = Track.class)
    @JoinColumn(name = "track_id")
    private Track track;

    public History() {
    }

    public History(int id, Genre genre, ContentCreator artist) {
        this.id = id;
        this.genre = genre;
        this.artist = artist;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }
}
