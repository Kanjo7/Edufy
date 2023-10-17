package com.edufy.edufy.services;

import com.edufy.edufy.models.*;
import com.edufy.edufy.repositories.*;
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
    @Autowired
    private ArtistRepository artistRepository;

    @Autowired
    private MediaTypeRepository mediaTypeRepository;
    @Autowired
    private PodhostRepository podhostRepository;


    @Autowired
    private GenreRepository genreRepository;

    @Override
    public List<MediaInterface> getAllMedia() {
        List<Track> allTracks = trackRepository.findAll();
        List<Video> allVideos = videoRepository.findAll();

        Set<MediaInterface> set = new LinkedHashSet<>(allTracks);
        set.addAll(allVideos);
        ArrayList<MediaInterface> allMedia = new ArrayList<>(set);
        return allMedia;
    }



    public List<MediaInterface> allMediaByMediaType(String type) {

        MediaType mediaType = mediaTypeRepository.findMediaTypeByType(type);
        Set<MediaInterface> set = new LinkedHashSet<>();

        List<MediaInterface> artistCC = artistRepository.findAllByMediaType(mediaType);
        List<MediaInterface> podHostCC = podhostRepository.findAllByMediaType(mediaType);
        List<MediaInterface> videoMI = videoRepository.findAllByMediaType(mediaType);

        set.addAll(artistCC);
        set.addAll(podHostCC);
        set.addAll(videoMI);

        ArrayList<MediaInterface> allMedia = new ArrayList<>(set);
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
