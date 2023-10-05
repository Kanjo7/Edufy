package com.edufy.edufy.repositories;

import com.edufy.edufy.models.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GenreRepository extends JpaRepository<Genre, Integer> {

/*    Genre saveGenre(Genre genre);

    void deleteGenre(int id);

    List<Genre> getAllGenres();

    Genre updateGenre(Genre genre, int id);*/
}
