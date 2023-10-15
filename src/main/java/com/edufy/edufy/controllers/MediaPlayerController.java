package com.edufy.edufy.controllers;

import com.edufy.edufy.models.DislikedMedia;
import com.edufy.edufy.models.LikedMedia;
import com.edufy.edufy.models.UserMediaHistory;
import com.edufy.edufy.services.HistoryServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/player")
public class MediaPlayerController {

    @Autowired
    private HistoryServices historyServices;


    //player media = add to history. need pathV userid and pathV media id

    // /play/pod/podId/userId - add to history
    @PostMapping("/play/track/{mediaid}/{userid}")
    public UserMediaHistory addTrackToHistory(@PathVariable("mediaid") int mediaId, @PathVariable("userid") int userid){
       return historyServices.addMediaToHistory(1, mediaId, userid);
    }

    @PostMapping("/play/video/{mediaid}/{userid}")
    public UserMediaHistory addVideoToHistory(@PathVariable("mediaid") int mediaId, @PathVariable("userid") int userid){
        return historyServices.addMediaToHistory(2, mediaId, userid);
    }

    // /dislike/track/id/userId
    @PostMapping("/play/like/track/{mediaid}/{userid}")
    public LikedMedia likeTrack(@PathVariable("mediaid") int mediaId, @PathVariable("userid") int userid){
        return historyServices.addLikedTrack(mediaId, userid);
    }

    @PostMapping("/play/like/video/{mediaid}/{userid}")
    public LikedMedia likeVideo(@PathVariable("mediaid") int mediaId, @PathVariable("userid") int userid){
        return historyServices.addLikedVideo(mediaId, userid);
    }

    @PostMapping("/play/dislike/track/{mediaid}/{userid}")
    public DislikedMedia dislikeTrack(@PathVariable("mediaid") int mediaId, @PathVariable("userid") int userid){
        return historyServices.addDislikedTrack(mediaId, userid);
    }

    @PostMapping("/play/dislike/video/{mediaid}/{userid}")
    public DislikedMedia dislikeVideo(@PathVariable("mediaid") int mediaId, @PathVariable("userid") int userid){
        return historyServices.addDislikedVideo(mediaId, userid);
    }



    // /dislike/episode/id/userId

    // /dislike/video/id/userId


    // /like/track/id/userId

    // /like/episode/id/userId

    // /like/track/id/userId


    public MediaPlayerController() {
    }


}
