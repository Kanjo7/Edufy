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
    public List<Media> getAllMedia() {
        List<Track> allTracks = trackRepository.findAll();
        List<Video> allVideos = videoRepository.findAll();

        Set<Media> set = new LinkedHashSet<>(allTracks);
        set.addAll(allVideos);
        ArrayList<Media> allMedia = new ArrayList<>(set);
        return allMedia;
    }

    public List<Genre> genreByMediaType(String type){
        MediaType mediaType = mediaTypeRepository.findMediaTypeByType(type);

        List<Genre> genreList = genreRepository.findAllByMediaTypes(mediaType);

        return genreList;
    }

    public List<ContentCreator> allCCByMediaType(String type){

        // VIDEO SAKNAS, ÄR MEDIA, KANSKE SKA VARA CC OCKSÅ??

        MediaType mediaType = mediaTypeRepository.findMediaTypeByType(type);
        Set<ContentCreator> set = new LinkedHashSet<>();

        List<ContentCreator> artistCC = artistRepository.findAllByMediaType(mediaType);
        List<ContentCreator> podHostCC = podhostRepository.findAllByMediaType(mediaType);

        set.addAll(artistCC);
        set.addAll(podHostCC);

        ArrayList<ContentCreator> allMedia = new ArrayList<>(set);
        return  allMedia;
    }
    public List<Media> allMediaByMediaType(String type){

        // BORDE INNEFATTA ALBUM OCH ARTIST OCKSÅ??

        MediaType mediaType = mediaTypeRepository.findMediaTypeByType(type);
        Set<Media> set = new LinkedHashSet<>();

        List<Track> allTracks = trackRepository.findAllByMediaType(mediaType);
        List<Video> allVideos = videoRepository.findAllByMediaType(mediaType);
        set.addAll(allVideos);
        set.addAll(allTracks);


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
