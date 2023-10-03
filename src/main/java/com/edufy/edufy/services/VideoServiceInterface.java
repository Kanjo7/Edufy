package com.edufy.edufy.services;

import com.edufy.edufy.models.Video;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface VideoServiceInterface {

    List<Video> getAllVideos();

    Video getVideo (int id);

    Video addVideo(Video video);

    void removeVideo(int id);
}
