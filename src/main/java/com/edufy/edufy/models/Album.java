package com.edufy.edufy.models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "albums")
public class Album {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "album_title")
    private String title;

    @OneToMany
    private List<Track> trackList = new ArrayList<>();


    public Album() {
    }

    public Album(String title) {
        this.title = title;
    }

    public Album(String title, List<Track> trackList) {
        this.title = title;
        this.trackList = trackList;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Track> getTrackList() {
        return trackList;
    }

    public void setTrackList(Track trackList) {
        this.trackList.add(trackList);
    }


}
