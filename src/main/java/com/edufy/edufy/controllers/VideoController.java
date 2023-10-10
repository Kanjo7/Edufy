package com.edufy.edufy.controllers;

import com.edufy.edufy.models.Video;
import com.edufy.edufy.services.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VideoController {

    @Autowired
    private VideoService videoService;

    // Get all Vidoes
    @GetMapping("/api/v1/getallvideos")
    private List<Video> getAllVidoes() {
        return videoService.getAllVideos();
    }

    // Get a Vidoe
    @GetMapping("/api/v1/getvideo/{id}")
    public Video getVideo(@PathVariable("id")int id){
        return videoService.getVideo(id);
    }

    // Add a new video
    @PostMapping("/api/v1/newvideo")
    private ResponseEntity<Video> addVideo(@RequestBody Video video){
        return new ResponseEntity<>(videoService.addVideo(video), HttpStatus.OK);
    }

    // remove a video
    @DeleteMapping("/api/v1/removevideo")
    private ResponseEntity<String> removeVideo(@PathVariable("id")int id){
        videoService.removeVideo(id);
        return new ResponseEntity<String>("Video has been removed", HttpStatus.OK);
    }
}
