package com.edufy.edufy.controllers;

import com.edufy.edufy.models.Episode;
import com.edufy.edufy.models.Track;
import com.edufy.edufy.services.EpisodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/")
public class EpisodeController {

    @Autowired
    private EpisodeService episodeService;

    public EpisodeController(){
    }

    @GetMapping("/getEpisodeByName/{episodeName}")
    public Episode getEpisodeByName(@PathVariable("episodeName") String episodeName){
        return episodeService.getEpisodeByName(episodeName);
    }

    @GetMapping("/getAllEpisodes")
    public List<Episode> getAllAllEpisodes(){
        return episodeService.getAllEpisodes();
    }

    @GetMapping("/episodeById/{id}")
    public Optional<Episode> episode(@PathVariable("id") int id){
        return episodeService.getEpisodeById(id);
    }

    @PostMapping("/saveEpisode")
    public Episode saveEpisode(Episode newEpisode){
        return episodeService.saveEpisode(newEpisode);
    }

    @DeleteMapping("/deleteEpisode/{id}")
    public String deleteEpisode(@PathVariable("id") int id){
        return episodeService.deleteEpisode(id);
    }
}
