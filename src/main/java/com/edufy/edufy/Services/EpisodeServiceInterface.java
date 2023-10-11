package com.edufy.edufy.services;

import com.edufy.edufy.models.Episode;
import org.springframework.stereotype.Repository;

@Repository
public interface EpisodeServiceInterface {

    Episode getEpisodeByName(String episodeName);

}
