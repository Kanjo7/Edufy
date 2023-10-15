package com.edufy.edufy.controllers;

import com.edufy.edufy.models.Artist;
import com.edufy.edufy.models.DislikedMedia;
import com.edufy.edufy.models.LikedMedia;
import com.edufy.edufy.models.UserMediaHistory;
import com.edufy.edufy.services.HistoryServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/history")
public class HistoryController {

    @Autowired
    private HistoryServices historyServices;

    // /gethistory/userid

    @GetMapping("/getall")
    public List<UserMediaHistory> getAllUserMediaHistory(){return historyServices.getAllMediaHistory();}

    @GetMapping("/byuserid/{id}")
    public List<UserMediaHistory> getHistoryByUser(@PathVariable("id") int id){
        return historyServices.getMediaHistoryByUser(id);
    }

    @GetMapping("/getall_liked")
    public List<LikedMedia> getLiked (){ return historyServices.getLikedMedia();}
    @GetMapping("/getalldisliked")
    public List <DislikedMedia> getDisliked (){ return historyServices.getDislikedMedia();}

    // /getlikedbyuser/userid
    @GetMapping("/getliked/{userid}")
    public List<LikedMedia> getLikedByUser (@PathVariable("userid") int userid){ return historyServices.getLikedMediaByUser(userid);}

    @GetMapping("/getdisliked/{userid}")
    public List<DislikedMedia> getDislikedByUser(@PathVariable("userid") int userid){ return historyServices.getDislikedMediaByUser(userid);}


    public HistoryController() {
    }

    public HistoryServices getHistoryServices() {
        return historyServices;
    }

    public void setHistoryServices(HistoryServices historyServices) {
        this.historyServices = historyServices;
    }
}
