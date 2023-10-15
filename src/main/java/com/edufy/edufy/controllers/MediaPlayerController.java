package com.edufy.edufy.controllers;

import com.edufy.edufy.models.Artist;
import com.edufy.edufy.models.UserMediaHistory;
import com.edufy.edufy.services.HistoryServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/player")
public class MediaPlayerController {

    @Autowired
    private HistoryServices historyServices;


    //player media = add to history. need pathV userid and pathV media id

    // /play/pod/podId/userId - add to history
    @PostMapping("/play/track/{mediaid}/{userid}")
    public UserMediaHistory addToHistory(@PathVariable("mediaid") int mediaId, @PathVariable("userid") int userid){
       return historyServices.addMediaToHistory(1, mediaId, userid);
    }
/*

    @GetMapping("/searchbyname/{artist}")
    public List<Artist> findByName(@PathVariable("artist") String artist){
        artist = artist.replace("-", " ").replace("+", " ").replace("%", " ");
        return artistServices.getArtistsByName(artist);
    }
    @PostMapping("/add")
    public Artist saveArtist(Artist newArtist){
        return artistServices.createArtist(newArtist);
    }

*/


    /*@RequestMapping(value = "/ex/foos/{fooid}/bar/{barid}", method = GET)
    @ResponseBody
    public String getFoosBySimplePathWithPathVariables
    (@PathVariable long fooid, @PathVariable long barid) {
        return "Get a specific Bar with id=" + barid +
                " from a Foo with id=" + fooid;
    }*/


    // /play/track/trackId/userId

    // /play/video/id/userId


    // /dislike/track/id/userId

    // /dislike/episode/id/userId

    // /dislike/video/id/userId


    // /like/track/id/userId

    // /like/episode/id/userId

    // /like/track/id/userId


    public MediaPlayerController() {
    }


}
