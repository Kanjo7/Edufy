package com.edufy.edufy.controllers;

import com.edufy.edufy.models.Track;
import com.edufy.edufy.services.TrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/")
public class ArtistController {
    /**
     * FIXA UPDATERING
     * RESPONSEENTITIES
     */
    @Autowired
    private TrackService trackService;

    public ArtistController() {
    }

    // GET ALL ARTISTS
    public List<Track> getAllAllArtists(){
        return trackService.getAllArtists();
    }
    // GET ARTIST BY ID todo: ResponseEntity <----------------------
    @GetMapping("/artistbyid/{id}")
    public Optional<Track> artistById(@PathVariable("id") long id){
        return trackService.getArtistById(id);
    }

    // POST, CREATE/SAVE NEW ARTIST
    @PostMapping("/saveartist")
    public Track saveAlbum(Track newTrack){
        return trackService.saveArtist(newTrack);
    }

    // UPDATE

    // DELETE ARTIST
    // returnerar en sträng som bekräftelse todo: kan ändras <-----------
    @DeleteMapping("/deleteartist/{id}")
    public String deleteArtist(@PathVariable("id") long id){
        return trackService.deleteArtist(id);
    }
}

