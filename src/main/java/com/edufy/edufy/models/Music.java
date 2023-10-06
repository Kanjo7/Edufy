package com.edufy.edufy.models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "music")
public class Music extends Media{

    @ManyToOne(targetEntity = Artist.class)
    @JoinColumn(name = "artist_id")
    private ContentCreator artist;


    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public Music() {
    }

    public Music(int id, String name, Genre genre, String releaseDate, MediaType mediaType, ContentCreator artist) {
        super(id, name, genre, releaseDate, mediaType);
        this.artist = artist;
    }

    @Override
    public MediaType getMediaType() {
        return super.getMediaType();
    }

    @Override
    public void setMediaType(MediaType mediaType) {
        super.setMediaType(mediaType);
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
    public Genre getGenre() {
        return super.getGenre();
    }

    @Override
    public void setGenre(Genre genre) {
        super.setGenre(genre);
    }

    public ContentCreator getArtist() {
        return artist;
    }

    public void setArtist(ContentCreator artist) {
        this.artist = artist;
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
