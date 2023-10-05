package com.edufy.edufy.models;

import jakarta.persistence.*;

@Entity
@Table(name = "media_type")
public class MediaType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "type")
    private String type;

    public MediaType(String type) {
        this.type = type;
    }

    public MediaType() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
