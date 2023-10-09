package com.edufy.edufy.services;

import com.edufy.edufy.models.Media;
import com.edufy.edufy.models.Track;
import com.edufy.edufy.models.Video;
import com.edufy.edufy.repositories.TrackRepository;
import com.edufy.edufy.repositories.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

@Service
public class MediaServices implements MediaServiceInterface {

    @Autowired
    private TrackRepository trackRepository;
    @Autowired
    private VideoRepository videoRepository;


    @Override
    public List<Media> getAllMedia() {
        List<Track> allTracks = trackRepository.findAll();
        List<Video> allVideos = videoRepository.findAll();

        Set<Media> set = new LinkedHashSet<>(allTracks);
        set.addAll(allVideos);
        ArrayList<Media> allMedia = new ArrayList<>(set);
        return allMedia;
    }

    public MediaServices(TrackRepository trackRepository, VideoRepository videoRepository) {
        this.trackRepository = trackRepository;
        this.videoRepository = videoRepository;
    }

    public TrackRepository getTrackRepository() {
        return trackRepository;
    }

    public void setTrackRepository(TrackRepository trackRepository) {
        this.trackRepository = trackRepository;
    }

    public VideoRepository getVideoRepository() {
        return videoRepository;
    }

    public void setVideoRepository(VideoRepository videoRepository) {
        this.videoRepository = videoRepository;
    }
}
