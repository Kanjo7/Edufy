package com.edufy.edufy.services;

import com.edufy.edufy.models.Track;
import com.edufy.edufy.repositories.TrackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TrackService implements TrackInterface{

    @Autowired
    private TrackRepository trackRepository;

    @Autowired
    private CompareDatesService compareDatesService;

    public TrackService() {
    }

    // Search Track by Name
    @Override
    public Track getTrackByName(String trackName) {
        return trackRepository.findTrackByNameContainsIgnoreCase(trackName);
    }
    // GET ALL
    public List<Track> getAllTracks(){

        //return trackRepository.findAll();
        // TODO sort tracks, TEST
        List<Track> trackList = trackRepository.findAll();
        compareDatesService.sortReleaseDates(trackList,Track::getReleaseDate);
        return trackList;
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
