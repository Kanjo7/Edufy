package com.edufy.edufy.models;

import jakarta.persistence.*;

@MappedSuperclass
public abstract class Media {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "media_name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "genre_id")
    private Genre genre;

    @Column(name = "release_date")
    private String releaseDate;

    @ManyToOne
    @JoinColumn(name = "media_type_id")
    private MediaType mediaType;

    public Media(int id, String name, Genre genre, String releaseDate, MediaType mediaType) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.mediaType = mediaType;
    }

    public Media() {
    }



    public MediaType getMediaType() {
        return mediaType;
    }

    public void setMediaType(MediaType mediaType) {
        this.mediaType = mediaType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }
}
