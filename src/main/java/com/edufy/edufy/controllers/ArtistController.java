package com.edufy.edufy.controllers;

import com.edufy.edufy.models.Artist;
import com.edufy.edufy.services.ArtistService;
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
    private ArtistService artistService;

    public ArtistController() {
    }

    // GET ALL ARTISTS
    public List<Artist> getAllAllArtists(){
        return artistService.getAllArtists();
    }
    // GET ARTIST BY ID todo: ResponseEntity <----------------------
    @GetMapping("/artistbyid/{id}")
    public Optional<Artist> artistById(@PathVariable("id") long id){
        return artistService.getArtistById(id);
    }

    // POST, CREATE/SAVE NEW ARTIST
    @PostMapping("/saveartist")
    public Artist saveAlbum(Artist newArtist){
        return artistService.saveArtist(newArtist);
    }

    // UPDATE

    // DELETE ARTIST
    // returnerar en sträng som bekräftelse todo: kan ändras <-----------
    @DeleteMapping("/deleteartist/{id}")
    public String deleteArtist(@PathVariable("id") long id){
        return artistService.deleteArtist(id);
    }
}

