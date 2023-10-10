package com.edufy.edufy.services;

import com.edufy.edufy.models.Media;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MediaServiceInterface{

    List<Media> getAllMedia();
/*    List<Media> getMediaByGenre();
    List<Media> getMediaByMusic();*/

}
