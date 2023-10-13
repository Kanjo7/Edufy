package com.edufy.edufy.models;

import jakarta.persistence.*;
@Entity
@Table(name = "Podcasts")
public class Podcast {
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


        public Podcast(int id, String title, String duration, String genre) {
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
        }
    }
