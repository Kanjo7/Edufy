package com.edufy.edufy.controllers;

import com.edufy.edufy.models.Genre;
import com.edufy.edufy.services.GenreServices;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GenreController {

    @Autowired
    private GenreServices genreServices;

    @PostMapping("/api/v1/addgenre")
    public ResponseEntity<Genre> saveCustomer(@RequestBody Genre genre) {

        return new ResponseEntity<>(genreServices.saveGenre(genre), HttpStatus.CREATED);
    }

    @GetMapping("/api/v1/genres")
    public List<Genre> getAllGenres() {
        return genreServices.getAllGenres();
    }

    @PutMapping("/api/v1/updategenre")
    public ResponseEntity<Genre> updateGenre(@PathVariable("id") int id, @RequestBody Genre genre) {

        return ResponseEntity.ok(genreServices.updateGenre(genre, id));
    }

    @DeleteMapping("/api/v1/deletecustomer/{id}")
    public ResponseEntity<String> deleteGenre(@PathVariable("id") int id) {
        genreServices.deleteGenre(id);

        return new ResponseEntity<String>("Genre deleted!", HttpStatus.OK);
    }

    @GetMapping("/api/v1/searchgenre/{genre}")
    public ResponseEntity<Genre> findByGenre(@PathVariable("genre") String genre){

        return ResponseEntity.ok(genreServices.findByGenre(genre));
    }

}
