package com.edufy.edufy.models;


import jakarta.persistence.*;

@Entity
@Table (name = "user_media_history")
public class UserMediaHistory extends History {

    public UserMediaHistory(int id, Track track, Video video, User user) {
        super(id, track, video, user);
    }

    public UserMediaHistory() {
    }


}
