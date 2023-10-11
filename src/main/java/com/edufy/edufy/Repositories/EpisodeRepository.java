package com.edufy.edufy.repositories;

import com.edufy.edufy.models.Episode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface EpisodeRepository extends JpaRepository<Episode, Integer> {
    Episode findEpisodeByNameContainsIgnoreCase(@Param("episodeName") String episodeName);
}
