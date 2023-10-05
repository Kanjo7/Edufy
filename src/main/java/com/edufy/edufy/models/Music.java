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
// Artist
/*    @OneToMany
    private List<Artist> artistList = new ArrayList<>();
    // Genre
    @OneToMany
    private List<Genre> genreList = new ArrayList<>();
    *//**
 *  Album one to one?? <---------------- Ändras
 *//*
    @OneToMany
    private List<Album> albumList = new ArrayList<>();
    *//**
 * Track ?? one to one eller one to many? ?? ? <---------- Ändras
 *//*
    @OneToMany
    private List<Track> trackList = new ArrayList<>();*/

/*    public Music(List<Artist> artistList, List<Genre> genreList, List<Album> albumList, List<Track> trackList) {
        this.artistList = artistList;
        this.genreList = genreList;
        this.albumList = albumList;
        this.trackList = trackList;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Artist> getArtistList() {
        return artistList;
    }

    public void setArtistList(Artist artist) {
        this.artistList.add(artist);
    }

    public List<Genre> getGenreList() {
        return genreList;
    }

    public void setGenreList(Genre genre) {
        this.genreList.add(genre);
    }

    public List<Album> getAlbumList() {
        return albumList;
    }

    public void setAlbumList(Album album) {
        this.albumList.add(album);
    }

    public List<Track> getTrackList() {
        return trackList;
    }

    public void setTrackList(Track track) {
        this.trackList.add(track);
    }*/