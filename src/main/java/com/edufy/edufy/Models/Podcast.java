package com.edufy.edufy.models;

import jakarta.persistence.*;
import com.edufy.edufy.models.Media;
@Entity
@Table(name = "Podcasts")
public class Podcast extends Media {

    @ManyToOne(targetEntity = Artist.class)
    @JoinColumn(name = "artist_id")
    private ContentCreator artist;

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public Podcast (){
    }

    public Podcast(int id, String name, Genre genre, String releaseDate, MediaType mediaType, ContentCreator artist) {
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

    /*
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;
        @Column(name = "title", nullable = false, length=60)
        private String title;
        @Column(name = "duration", nullable = false, length=50)
        private String duration;
        @Column(name = "genre", nullable = false, length = 50)
        private String genre;
        //releasedate
        //url
        //connect to "artist"
        //connect to album?
   /* @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "artist_id")
    private Artist artist; */


    /*    public Podcast(int id, String title, String duration, String genre) {
            this.id = id;
            this.title = title;
            this.duration = duration;
            this.genre = genre;
        }

        public Podcast() {
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

        public String getDuration() {
            return duration;
        }

        public void setDuration(String duration) {
            this.duration = duration;
        }

        public String getGenre() {
            return genre;
        }

        public void setGenre(String genre) {
            this.genre = genre;
        } */
    }
