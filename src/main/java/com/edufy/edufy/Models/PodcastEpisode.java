package com.edufy.edufy.models;

import com.edufy.edufy.models.Track;

public class PodcastEpisode extends Track {


    
    public PodcastEpisode(int id, String name, Genre genre, String releaseDate, MediaType mediaType) {
        super(id, name, genre, releaseDate, mediaType);
    }
}
