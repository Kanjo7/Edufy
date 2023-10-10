package com.edufy.edufy.repositories;

import com.edufy.edufy.models.Track;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TrackRepository extends JpaRepository<Track,Integer> {
    Track findTrackByNameContainsIgnoreCase(@Param("trackName") String trackName);


}
