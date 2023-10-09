package com.edufy.edufy.services;


import com.edufy.edufy.exceptions.ResourceNotFoundException;
import com.edufy.edufy.models.Genre;
import com.edufy.edufy.repositories.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenreServices implements GenreServicesInterface {

    @Autowired
    private GenreRepository genreRepository;


    public GenreServices(GenreRepository genreRepository) {
        this.genreRepository = genreRepository;
    }

    @Override
    public Genre saveGenre(Genre genre) {
        return genreRepository.save(genre);
    }

    @Override
    public void deleteGenre(int id) {
        genreRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Genre", "id", id));
        genreRepository.deleteById(id);
    }

    @Override
    public List<Genre> findByGenre(String genre) {

        return genreRepository.findByGenreNameContainingIgnoreCase(genre);

    }

    @Override
    public List<Genre> getAllGenres() {
        return genreRepository.findAll();
    }

    @Override
    public Genre updateGenre(Genre genre, int id) {
        Genre g = genreRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Genre", "id", id));
        g.setGenreName(genre.getGenreName());
        genreRepository.save(g);

        return g;
    }
}
