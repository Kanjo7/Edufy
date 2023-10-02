package com.edufy.edufy.services;

import com.edufy.edufy.models.Genre;

import java.util.List;

public interface GenreServicesInterface {

    Genre saveGenre(Genre genre);

    List<Genre> getAllGenres();

    Genre updateGenre(Genre genre, int id);

    void deleteGenre(int id);

}
