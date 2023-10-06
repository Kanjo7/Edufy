package com.edufy.edufy.services;

import com.edufy.edufy.models.Album;
import com.edufy.edufy.models.Artist;
import com.edufy.edufy.models.Music;
import com.edufy.edufy.repositories.ArtistRepository;
import com.edufy.edufy.repositories.MusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class MusicService implements MusicInterface{

    @Autowired
    private MusicRepository musicRepository;

    @Autowired
    private AlbumService albumService;

    @Autowired
    private ArtistServices artistServices;

    public MusicService() {
    }

    // GET ALBUM BY ARTIST NAME
    public List<Album> getAlbumsByArtist(String artistName) {

        Artist artist = artistServices.getArtistByName(artistName);

        System.out.println("Artist name: " + artist.getName() + " " + artist.getName());


        if (artist == null) {
            // Hantera fel
            return Collections.emptyList();
        }

        int musicId = artist.getMusicList().get(0).getId();

        Music music = musicRepository.findById(musicId).orElse(null);
        System.out.println("music ID: " + music.getId());

        if (music == null) {
            // Hantera fel
            return Collections.emptyList();
        }

        List<Album> albums = music.getAlbumList();
        for (Album a : albums){
            System.out.println(a.getTitle());
        }

        return albums;
    }

    // GET ALL
    public List<Music> getAllMusic(){
        return musicRepository.findAll();
    }
    // GET BY ID
    public Optional<Music> getMusicById(int id){
        return musicRepository.findById(id);
    }
    // SAVE
    public Music saveMusic(Music newMusic){
        return musicRepository.save(newMusic);
    }
    // UPDATE todo: <--------------------------

    // DELETE
    public String deleteMusic(int id){
        Optional<Music> optionalMusic = musicRepository.findById(id);
        if(optionalMusic.isPresent()){
            musicRepository.deleteById(id);
            return "Music was deleted successfully";
        }
        return "Music id does not exist...";
    }
}
