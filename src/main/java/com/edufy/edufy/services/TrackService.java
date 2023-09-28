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
    public List<Track> getAllArtists(){
        return trackRepository.findAll();
    }
    // GET BY ID
    public Optional<Track> getArtistById(long id){
        return trackRepository.findById(id);
    }

    // SAVE
    public Track saveArtist(Track newTrack){
        return trackRepository.save(newTrack);
    }
    // UPDATE todo:  <------------------

    // DELETE
    public String deleteArtist(long id){
        Optional<Track> optionalArtist = trackRepository.findById(id);
        if(optionalArtist.isPresent()){
            trackRepository.deleteById(id);
            return "Artist was deleted successfully";
        }
        return "Could not find artist with that id";
    }
}
