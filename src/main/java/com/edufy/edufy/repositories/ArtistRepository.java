package com.edufy.edufy.repositories;

import com.edufy.edufy.models.Artist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArtistRepository extends JpaRepository<Artist, Integer> {

    Artist findArtistByName(String name);
    List<Artist> findArtistsByGenre(String genre);

}
