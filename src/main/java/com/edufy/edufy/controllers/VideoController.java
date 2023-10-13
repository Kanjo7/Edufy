package com.edufy.edufy.controllers;

import com.edufy.edufy.models.Video;
import com.edufy.edufy.services.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/videos")
public class VideoController {

    @Autowired
    private VideoService videoService;

    // Get all Vidoes
    @GetMapping("/getall")
    private List<Video> getAllVidoes() {
        return videoService.getAllVideos();
    }

    // Get a Vidoe
    @GetMapping("getbyid/{id}")
    public Video getVideo(@PathVariable("id")int id){
        return videoService.getVideo(id);
    }

    // Add a new video
    @PostMapping("/add")
    private ResponseEntity<Video> addVideo(@RequestBody Video video){
        return new ResponseEntity<>(videoService.addVideo(video), HttpStatus.OK);
    }

    // remove a video
    @DeleteMapping("/delete/{id}")
    private ResponseEntity<String> removeVideo(@PathVariable("id")int id){
        videoService.removeVideo(id);
        return new ResponseEntity<String>("Video has been removed", HttpStatus.OK);
    }

    @GetMapping("/searchbyname/{videoName}")
    public Video getVideoByName(@PathVariable("videoName")String videoName){
        return videoService.getVideoByName(videoName);
    }

    @GetMapping("/bygenre/{genreName}")
    public List<Video> getVideoByGenre(@PathVariable("genreName")String genreName){
        return videoService.getVideoByGenre(genreName);
    }
}
