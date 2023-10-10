package com.edufy.edufy.Controllers;

import com.edufy.edufy.Models.Podcast;
import com.edufy.edufy.Repositories.PodcastRepository;
import com.edufy.edufy.Services.PodcastService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/v1/")
public class PodcastController {
    @Autowired
    private PodcastService podcastService;
    @Autowired
    private PodcastRepository podcastRepository;


    @PostMapping("/savePodcast")
    public ResponseEntity<Podcast> savePodcast(@RequestBody Podcast podcast){
        return new ResponseEntity<Podcast>(podcastService.savePodcast(podcast), HttpStatus.CREATED);
    }

    @GetMapping("/podcasts")
    public List<Podcast> getAllPodcasts(){
        return podcastService.getAllPodcasts();
    }

    @PutMapping("/updatePodcast")
    public ResponseEntity<Podcast> updatePodcast(@PathVariable("id") int ID, @RequestBody Podcast podcast){
        return ResponseEntity.ok(podcastService.updatePodcast(podcast, ID));
    }

    @DeleteMapping("/delete/podcastID")
    public ResponseEntity<String> deletePodcast(@PathVariable ("id") int ID){
        podcastService.deletePodcast(ID);
        return new ResponseEntity<String>("Podcast was successfully deleted", HttpStatus.OK);
    }
}
