package com.edufy.edufy.services;

import com.edufy.edufy.models.Podcast;
import com.edufy.edufy.repositories.PodcastRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PodcastService implements PodcastServiceInterface {

    @Autowired
    private PodcastRepository podcastRepository;
    @Autowired
    private AlbumService albumService;
    @Autowired
    private ArtistServices artistServices;
    public PodcastService() {
    }
    @Override
    public Podcast savePodcast(Podcast podcast){
        return podcastRepository.save(podcast);
    }
    @Override
    public List<Podcast> getAllPodcasts() {
        return podcastRepository.findAll();
    }
   @Override
    public Podcast updatePodcast (Podcast podcast, int ID) {
        Podcast p = podcastRepository.findById(ID).orElseThrow();
       /* p.setTitle(podcast.getTitle());
        p.setDuration(podcast.getDuration());*/
        p.setGenre(podcast.getGenre());
        return p;
    }
    @Override
    public void deletePodcast(int ID){
        podcastRepository.findById(ID).orElseThrow();
        podcastRepository.deleteById(ID);
    }
}
