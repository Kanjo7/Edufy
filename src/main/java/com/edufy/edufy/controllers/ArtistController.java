package com.edufy.edufy.controllers;

import com.edufy.edufy.models.Artist;
import com.edufy.edufy.models.User;
import com.edufy.edufy.services.ArtistServices;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/")
public class ArtistController {

    private ArtistServices artistServices;

    public ArtistController(ArtistServices artistServices) {
        this.artistServices = artistServices;
    }

    //get all artists
    @GetMapping("/getallartists")
    public List<Artist> getAllAllArtists(){
        return artistServices.getAllArtists();
    }

    //get artist by id
    @GetMapping("/artistbyid/{id}")
    public Optional<Artist> artistById(@PathVariable("id") int id){
        return artistServices.getArtistById(id);
    }

    //add/create artist
    @PostMapping("/saveartist")
    public Artist saveArtist(Artist newArtist){
        return artistServices.createArtist(newArtist);
    }

    //get artists by genre
    @GetMapping("/artistbygenre/{genre}")
    public List<Artist> artistByGenre(@PathVariable("genre") String genre){
        genre = genre.replace("-", " ");
        return artistServices.getArtistsByGenre(genre);
    }

    //update artist
    @PutMapping("/updateartist/{id}")
    public ResponseEntity<Artist> updateArtist(@PathVariable("id")int id, @RequestBody Artist artist) {
        return ResponseEntity.ok(artistServices.updateArtist(artist, id));
    }
    //delete artist

    @DeleteMapping("/deleteartist/{id}")
    public void deleteArtist(@PathVariable("id") int id){
        artistServices.deleteArtist(id);
    }


}
