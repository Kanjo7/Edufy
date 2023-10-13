package com.edufy.edufy.repositories;

import com.edufy.edufy.models.Music;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import java.util.List;

public interface MusicRepository extends JpaRepository<Music,Integer> {
    List<Music> findAll();

    Music findMusicByNameContainingIgnoreCase(@Param("musicName")String musicName);

    @Query("SELECT a FROM Music a JOIN a.genre genre WHERE genre.genreName = :genreName")
    List<Music> findMusicByGenreContainingIgnoreCase(@Param("genreName")String genreName);

}
