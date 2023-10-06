package com.edufy.edufy.models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Music { // TODO EXTENDS MEDIA <-------------------------------


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    // Artist
    @ManyToMany(mappedBy = "musicArtistList", cascade = CascadeType.ALL)
    private List<Artist> artistList = new ArrayList<>();
    // Genre
    @ManyToMany
    private List<Genre> genreList = new ArrayList<>();
    /**
     *  Album one to one?? <---------------- Ändras
      */
    @ManyToMany
    private List<Album> albumList = new ArrayList<>();
    /**
     * Track ?? one to one eller one to many? ?? ? <---------- Ändras
     */
    @ManyToMany
    private List<Track> trackList = new ArrayList<>();

    public Music() {
    }

    public Music(List<Artist> artistList, List<Genre> genreList, List<Album> albumList, List<Track> trackList) {
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
    }
}
