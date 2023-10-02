package com.edufy.edufy.models;


import jakarta.persistence.*;

@Entity
public class Genre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 20)
    String genre;

    /*
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "albumId")
    private Album album;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "artistId")
    private Artist artist;
 */

    public Genre() {
    }

    public Genre(int id, String genre) {
        this.id = id;
        this.genre = genre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }


    @Override
    public String toString() {
        return "Genre{" +
                "id=" + id +
                ", genre='" + genre + '\'' +
                '}';
    }
}
