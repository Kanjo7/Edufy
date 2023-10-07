package com.edufy.edufy.controllers;

import com.edufy.edufy.models.Album;
import com.edufy.edufy.services.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class AlbumController {

    @Autowired
    private AlbumService albumService;

    public AlbumController() {
    }

    // GET ALBUM BY ARTIST NAME
/*    @GetMapping("/albumsbyartistname/{artistName}")
    public List<Album> getAlbumsByArtistName(@PathVariable("artistName") String artistName) {
        return albumService.findAlbumsByArtistName(artistName);
    }*/
    // GET ALBUM BY ALBUM TITLE
    @GetMapping("/albumbyalbumtitle")
    public Album getAlbumByTitle(@RequestParam String albumTitle){
        return albumService.getAlbumByTitle(albumTitle);
    }
    // GET ALL ALBUMS
    @GetMapping("/getallalbums")
    public List<Album> getAllAlbums(){
        return albumService.getAllAlbums();
    }
    // GET ALBUM BY ID todo: ResponseEntity <----------------------
    @GetMapping("/albumbyid/{id}")
    public  Optional<Album> albumById(@PathVariable("id") int id){
        return albumService.albumById(id);
    }

    // POST, CREATE/SAVE NEW ALBUM
    @PostMapping("/savealbum")
    public Album saveAlbum(Album newAlbum){
        return albumService.saveAlbum(newAlbum);
    }

    // UPDATE

    // DELETE ALBUM
    // returnerar en sträng som bekräftelse todo: kan ändras <-----------
    @DeleteMapping("/deletealbum/{id}")
    public String deleteAlbum(@PathVariable("id") int id){
        return albumService.deleteAlbum(id);
    }
}
