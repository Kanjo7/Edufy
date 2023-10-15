package com.edufy.edufy.repositories;

import com.edufy.edufy.models.Video;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VideoRepository extends JpaRepository<Video, Integer> {
    Video findVideoByNameContainingIgnoreCase(@Param("videoName")String videoName);

    Video findById(@Param("mediaId") int mediaId);

    @Query("SELECT a FROM Video a JOIN a.genre genre WHERE genre.genreName = :genreName")
    List<Video> findVideoByGenreContainingIgnoreCase(@Param("genreName")String genreName);
}
