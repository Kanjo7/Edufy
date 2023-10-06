package com.edufy.edufy.repositories;

import com.edufy.edufy.models.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GenreRepository extends JpaRepository<Genre, Integer> {

    @Query("SELECT s FROM Genre s WHERE s.genreName =:genre")
    Genre findByGenre(@Param("genre") String genre);

}
