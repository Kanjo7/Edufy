package com.edufy.edufy.models;


import jakarta.persistence.*;

@Entity
@Table (name = "user_media_history")
public class UserMediaHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;



}
