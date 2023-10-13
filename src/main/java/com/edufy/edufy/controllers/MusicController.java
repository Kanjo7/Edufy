package com.edufy.edufy.controllers;

import com.edufy.edufy.models.Album;
import com.edufy.edufy.models.Music;
import com.edufy.edufy.services.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/music")
public class MusicController {
    /**
     * FIXA UPDATERING
     * RESPONSEENTITIES
     */
    @Autowired
    private MusicService musicService;

    public MusicController() {
    }

    // hämta ARTIST genom music
    // hämta GENRE genom music
    // hämta ALBUM by artist name

    // hämta TRACK genom music?????
    // GET ALL MUSIC
    @GetMapping("/getallmusic")
    public List<Music> getAllAllMusic(){
        return musicService.getAllMusic();
    }
    // GET MUSIC BY ID todo: ResponseEntity <----------------------
    @GetMapping("/musicbyid/{id}")
    public Optional<Music> musicById(@PathVariable("id") int id){
        return musicService.getMusicById(id);
    }

    // POST, CREATE/SAVE NEW MUSIC
    @PostMapping("/savemusic")
    public Music saveMusic(Music newMusic){
        return musicService.saveMusic(newMusic);
    }

    // UPDATE

    // DELETE MUSIC
    // returnerar en sträng som bekräftelse todo: kan ändras <-----------
    @DeleteMapping("/deletemusic/{id}")
    public String deleteMusic(@PathVariable("id") int id){
        return musicService.deleteMusic(id);
    }

    @GetMapping("/searchbyname/{musicName}")
    public Music getMusicByName(@PathVariable("musicName")String musicName){
        return musicService.getMusicByName(musicName);
    }

    @GetMapping("/bygenre/{genreName}")
    public List<Music> getMusicByGenre(@PathVariable("genreName")String genreName){
        return musicService.getMusicbyGenre(genreName);
    }
}
