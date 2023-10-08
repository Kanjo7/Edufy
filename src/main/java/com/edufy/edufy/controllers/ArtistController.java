package com.edufy.edufy.controllers;

import com.edufy.edufy.models.Artist;
import com.edufy.edufy.services.ArtistServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class ArtistController {

    @Autowired
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
    @GetMapping("/getartistbyid/{id}")
    public Optional<Artist> artistById(@PathVariable("id") int id){
        return artistServices.getArtistById(id);
    }

    //get artists by genre-id
    @GetMapping ("/getartistsbygenre/{id}")

    public List<Artist> getArtistsByGenreId(@PathVariable("id") int id){ return artistServices.getArtistsByGenre(id); }

    @GetMapping("/getartistsbygenrename/{genreName}")
    public List<Artist> getArtistsByGenreName (@PathVariable("genreName") String genreName){
        return artistServices.getArtistsByGenreName(genreName);
    }

    //add/create artist
    @PostMapping("/createartist")
    public Artist saveArtist(Artist newArtist){
        return artistServices.createArtist(newArtist);
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

    @GetMapping("/searchartist/{artist}")
    public List<Artist> findByName(@PathVariable("artist") String artist){
         artist = artist.replace("-", " ").replace("+", " ").replace("%", " ");
        return artistServices.getArtistsByName(artist);
    }

}
