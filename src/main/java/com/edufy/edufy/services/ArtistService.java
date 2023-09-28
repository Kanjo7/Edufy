package com.edufy.edufy.services;

import com.edufy.edufy.models.Artist;
import com.edufy.edufy.repositories.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArtistService {

    @Autowired
    private ArtistRepository artistRepository;

    public ArtistService() {
    }

    // GET ALL
    public List<Artist> getAllArtists(){
        return artistRepository.findAll();
    }
    // GET BY ID
    public Optional<Artist> getArtistById(long id){
        return artistRepository.findById(id);
    }

    // SAVE
    public Artist saveArtist(Artist newArtist){
        return artistRepository.save(newArtist);
    }
    // UPDATE todo:  <------------------

    // DELETE
    public String deleteArtist(long id){
        Optional<Artist> optionalArtist = artistRepository.findById(id);
        if(optionalArtist.isPresent()){
            artistRepository.deleteById(id);
            return "Artist was deleted successfully";
        }
        return "Could not find artist with that id";
    }
}
