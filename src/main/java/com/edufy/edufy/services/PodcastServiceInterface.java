package com.edufy.edufy.services;

import com.edufy.edufy.models.Podcast;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PodcastServiceInterface {

    List<Podcast> getAllPodcasts();
    Podcast updatePodcast(Podcast podcast, int ID);
    Podcast savePodcast(Podcast podcast);
    void deletePodcast(int ID);
}
