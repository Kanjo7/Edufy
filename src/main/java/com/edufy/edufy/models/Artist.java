package com.edufy.edufy.models;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Table(name = "artists")
@Entity
public class Artist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "artist_id", nullable = false)
    private int id;

    @Column(name = "artist_name")
    private String name;

    @Column(name = "artist_genre")
    private String genre;

    @ManyToOne
    @JoinColumn
    private Album album;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "MUSIC_ARTISTLIST",
            joinColumns = @JoinColumn(name = "artist_id"),
            inverseJoinColumns = @JoinColumn(name = "music_id")
    )
    private List<Music> musicArtistList = new ArrayList<>();


    //Constructors

    public Artist() {
    }

    public Artist(int id, String name, String genre, Album album) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.album = album;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public List<Music> getMusicList() {
        return musicArtistList;
    }

    public void setMusicList(Music musicList) {
        this.musicArtistList.add(musicList);
    }
}
