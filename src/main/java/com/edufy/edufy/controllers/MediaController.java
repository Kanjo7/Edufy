package com.edufy.edufy.controllers;

import com.edufy.edufy.models.Media;
import com.edufy.edufy.services.MediaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class MediaController {

    @Autowired
    private MediaServices mediaServices;

    //get all media
    @GetMapping("/getallmedia")
    public List<Media> getAllAllMedia(){
        return mediaServices.getAllMedia();
    }


    @GetMapping("/getallbymediatype/{mediaType}")
    public List<Media> allMediaByMediaType(@PathVariable("mediaType")String mediaType){
        return mediaServices.allMediaByMediaType(mediaType);
    }
    public MediaController(MediaServices mediaServices) {
        this.mediaServices = mediaServices;
    }

    public MediaServices getMediaServices() {
        return mediaServices;
    }

    public void setMediaServices(MediaServices mediaServices) {
        this.mediaServices = mediaServices;
    }
}
