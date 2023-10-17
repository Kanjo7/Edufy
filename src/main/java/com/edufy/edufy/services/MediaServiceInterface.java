package com.edufy.edufy.services;

import com.edufy.edufy.models.Media;
import com.edufy.edufy.models.MediaInterface;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MediaServiceInterface{

    List<MediaInterface> getAllMedia();
/*    List<Media> getMediaByGenre();
    List<Media> getMediaByMusic();*/

}
