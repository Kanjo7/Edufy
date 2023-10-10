package com.edufy.edufy.controllers;

import com.edufy.edufy.models.Track;
import com.edufy.edufy.services.TrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/")
public class TrackController {

    @Autowired
    private TrackService trackService;

    public TrackController() {
    }

    // search track by name
    @GetMapping("/gettrackbyname/{trackName}")
    public Track getTrackByName(@PathVariable("trackName") String trackName){
        return trackService.getTrackByName(trackName);
    }
    // GET ALL TRACKS
    @GetMapping("/getalltracks")
    public List<Track> getAllAllTracks(){
        return trackService.getAllTracks();
    }
    // GET TRACKS BY ID todo: ResponseEntity <----------------------
    @GetMapping("/tracksbyid/{id}")
    public Optional<Track> trackById(@PathVariable("id") int id){
        return trackService.getTrackById(id);
    }

    // POST, CREATE/SAVE NEW TRACK
    @PostMapping("/savetrack")
    public Track saveTrack(Track newTrack){
        return trackService.saveTrack(newTrack);
    }

    // UPDATE

    // DELETE TRACK
    // returnerar en sträng som bekräftelse todo: kan ändras <-----------
    @DeleteMapping("/deletetrack/{id}")
    public String deleteTrack(@PathVariable("id") int id){
        return trackService.deleteTrack(id);
    }
}

