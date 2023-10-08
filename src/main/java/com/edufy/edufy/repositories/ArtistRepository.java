package com.edufy.edufy.repositories;

import com.edufy.edufy.models.Album;
import com.edufy.edufy.models.Artist;
import com.edufy.edufy.models.Genre;
import com.edufy.edufy.models.Track;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArtistRepository extends JpaRepository<Artist, Integer> {

    List<Artist> findArtistByNameContainingIgnoreCase(@Param("artist") String artist);
/*    List<Artist> findArtistByGenre(int id);*/
}
