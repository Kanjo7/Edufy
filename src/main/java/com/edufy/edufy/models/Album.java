package com.edufy.edufy.models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;


@Entity
public class Album {

    /**
     * todo: SQL för att få fram koppling mellan album och track i h2 db
     * SELECT
     *   album.id AS album_id,
     *   album.title AS album_title,
     *   track.id AS track_id,
     *   track.name AS track_name
     * FROM
     *   Album album
     * INNER JOIN
     *   Track track ON album.id = track.album_id;
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String title;

    @OneToMany(mappedBy = "album", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<Track> tracks = new ArrayList<>();

    public Album() {
    }

    public void setTracks(List<Track> tracks) {
        this.tracks = tracks;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Track> getTracks() {
        return tracks;
    }

    public void setTracks(Track track) {
        this.tracks.add(track);
    }
}
