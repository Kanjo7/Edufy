package com.edufy.edufy.models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "podhosts")
public class Podhost implements ContentCreator{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "podhost_id", nullable = false)
    private int id;

    @Column(name = "podhost_name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "genre_id")
    private Genre genre;

    @OneToMany(mappedBy = "episodes", cascade = CascadeType.ALL)
    private List<Episode> episodeList = new ArrayList<>();

    public Podhost(){
    }

    public Podhost(int id, String name, Genre genre, List<Episode> episodeList) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.episodeList = episodeList;
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

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public List<Episode> getEpisodeList() {
        return episodeList;
    }

    public void setEpisodeList(List<Episode> episodeList) {
        this.episodeList = episodeList;
    }
}
