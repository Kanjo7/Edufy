package com.edufy.edufy.controllers;

import com.edufy.edufy.models.Album;
import com.edufy.edufy.services.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/")
public class AlbumController {
    /**
     * FIXA UPDATERING
     * RESPONSEENTITIES
     */
    @Autowired
    private AlbumService albumService;

    public AlbumController() {
    }

    // GET ALL ALBUMS
    public List<Album> getAllAlbums(){
        return albumService.getAllAlbums();
    }
    // GET ALBUM BY ID todo: ResponseEntity <----------------------
    @GetMapping("/albumbyid/{id}")
    public  Optional<Album> albumById(@PathVariable("id") long id){
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
    public String deleteAlbum(@PathVariable("id") long id){
        return albumService.deleteAlbum(id);
    }
}
