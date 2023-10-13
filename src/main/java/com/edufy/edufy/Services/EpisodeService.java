package com.edufy.edufy.services;

import com.edufy.edufy.models.Episode;
import com.edufy.edufy.repositories.EpisodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EpisodeService implements EpisodeServiceInterface {

    @Autowired
    private EpisodeRepository episodeRepository;

    public EpisodeService() {
    }

    @Override
    public Episode getEpisodeByName(String episodeName) {
        return episodeRepository.findEpisodeByNameContainsIgnoreCase(episodeName);
    }

    public List<Episode> getAllEpisodes(){
        return episodeRepository.findAll();
    }

    public Optional<Episode> getEpisodeById(int id){
        return episodeRepository.findById(id);
    }

    public Episode saveEpisode(Episode newEpisode){
        return episodeRepository.save(newEpisode);
    }

    public String deleteEpisode(int id){
        Optional<Episode> optionalEpisode = episodeRepository.findById(id);
        if(optionalEpisode.isPresent()){
            episodeRepository.deleteById(id);
            return "Episode was successfully deleted!";
        }
        return "An episode with that ID could not be found";
    }
}
