package com.edufy.edufy.models;

import jakarta.persistence.*;

@Entity
@Table(name = "tracks")
public class Track extends Media{



    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "album_id")
    private Album album;

    @ManyToOne(targetEntity = Artist.class)
    @JoinColumn(name = "artist_id")
    private ContentCreator artist;


    public ContentCreator getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public Track() {
    }

    public Track(int id, String name, Genre genre, String releaseDate, MediaType mediaType) {
        super(id, name, genre, releaseDate, mediaType);
    }

    @Override
    public MediaType getMediaType() {
        return super.getMediaType();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setMediaType(MediaType mediaType) {
        super.setMediaType(mediaType);
    }

    @Override
    public Genre getGenre() {
        return super.getGenre();
    }

    @Override
    public void setGenre(Genre genre) {
        super.setGenre(genre);
    }

    @Override
    public String getReleaseDate() {
        return super.getReleaseDate();
    }

    @Override
    public void setReleaseDate(String releaseDate) {
        super.setReleaseDate(releaseDate);
    }
}
