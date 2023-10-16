package com.edufy.edufy.models;

import jakarta.persistence.*;

@Entity
@Table(name = "videos")
public class Video extends Media{

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "artist_id")
    private Artist artist;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "album_id")
    private Album album;

    public Video (){
    }

    public Video(int id, String name, Genre genre, String releaseDate, MediaType mediaType, String url) {
        super(id, name, genre, releaseDate, mediaType, url);
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

    @Override
    public String getReleaseDate() {
        return super.getReleaseDate();
    }

    @Override
    public void setReleaseDate(String releaseDate) {
        super.setReleaseDate(releaseDate);
    }
    @Override
    public String getUrl(){
        return super.getUrl();
    }

    @Override
    public void setUrl(String url){
        super.setUrl(url);
    }

}
