package com.edufy.edufy.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "disliked")
public class DislikedMedia extends History {

    //id
    //track
    //user

    public DislikedMedia() {
    }

    public DislikedMedia(int id, Track track, Video video, User user) {
        super(id, track, video, user);
    }

    public DislikedMedia(int id, Track track, User user) {
        super(id, track, user);
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public void setId(int id) {
        super.setId(id);
    }

    @Override
    public Track getTrack() {
        return super.getTrack();
    }

    @Override
    public void setTrack(Track track) {
        super.setTrack(track);
    }

    @Override
    public User getUser() {
        return super.getUser();
    }

    @Override
    public void setUser(User user) {
        super.setUser(user);
    }
}
