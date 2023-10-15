package com.edufy.edufy.models;


import jakarta.persistence.*;

@MappedSuperclass
public abstract class History {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    @ManyToOne(targetEntity = Track.class)
    @JoinColumn(name = "track_id")
    private Track track;

    @ManyToOne(targetEntity = Video.class)
    @JoinColumn(name = "video_id")
    private Video video;

    @ManyToOne(targetEntity = User.class)
    @JoinColumn(name = "user_id")
    private User user;

    public History() {
    }

    public History(int id, Track track, Video video, User user) {
        this.id = id;
        this.track = track;
        this.video = video;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Track getTrack() {
        return track;
    }

    public void setTrack(Track track) {
        this.track = track;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }
}
