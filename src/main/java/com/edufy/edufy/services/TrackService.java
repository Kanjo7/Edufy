package com.edufy.edufy.services;

import com.edufy.edufy.models.Track;
import com.edufy.edufy.repositories.TrackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TrackService {

    @Autowired
    private TrackRepository trackRepository;

    public TrackService() {
    }

    // GET ALL
    public List<Track> getAllTracks(){
        return trackRepository.findAll();
    }
    // GET BY ID
    public Optional<Track> getTrackById(int id){
        return trackRepository.findById(id);
    }

    // SAVE
    public Track saveTrack(Track newTrack){
        return trackRepository.save(newTrack);
    }
    // UPDATE todo:  <------------------

    // DELETE
    public String deleteTrack(int id){
        Optional<Track> optionalTrack = trackRepository.findById(id);
        if(optionalTrack.isPresent()){
            trackRepository.deleteById(id);
            return "Track was deleted successfully";
        }
        return "Could not find Track with that id";
    }
}
