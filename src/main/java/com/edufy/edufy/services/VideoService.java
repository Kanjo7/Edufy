package com.edufy.edufy.services;

import com.edufy.edufy.models.Video;
import com.edufy.edufy.repositories.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoService implements VideoServiceInterface {

    @Autowired
    private VideoRepository videoRepository;

    //Get all videos
    @Override
    public List<Video> getAllVideos() {
        return videoRepository.findAll();
    }

    //Get a video
    @Override
    public Video getVideo(int id) {
        return videoRepository.findById(id).orElseThrow();
    }

    //Add a video
    @Override
    public Video addVideo(Video video) {
        return videoRepository.save(video);
    }

    //Remove a video
    @Override
    public void removeVideo(int id) {
        videoRepository.findById(id);
        videoRepository.deleteById(id);

    }
}
