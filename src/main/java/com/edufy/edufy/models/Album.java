package com.edufy.edufy.models;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Album {
    /**
     All media ska ha möjligheten att vara kopplade till ett album med ordning på albumet.
     - one to one? many to one? till media
     - Title
     - Artist oneToOne
     - Genre oneToOne eller?
     - Release Date
     - TrackList, OneToMany till ? -Track- ? egen model??
     */

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String title;
    // @OneToOne()
    private String Artist;
    // @OneToOne()
    private String genre;
    private Date releaseDate;
    // GETTER N SETTER     TODO: FIX THIS LATER           <-------------------------
    //@OneToMany
    // private List<Track> trackList;


    public Album() {
    }

    public Album(String title, String artist, String genre, Date releaseDate) {
        this.title = title;
        Artist = artist;
        this.genre = genre;
        this.releaseDate = releaseDate;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return Artist;
    }

    public void setArtist(String artist) {
        Artist = artist;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }
}
