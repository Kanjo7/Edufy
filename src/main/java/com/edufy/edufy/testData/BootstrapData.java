package com.edufy.edufy.testData;

import com.edufy.edufy.models.Album;
import com.edufy.edufy.models.Track;
import com.edufy.edufy.models.Music;
import com.edufy.edufy.repositories.AlbumRepository;
import com.edufy.edufy.repositories.TrackRepository;
import com.edufy.edufy.repositories.MusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {

    @Autowired
    private AlbumRepository albumRepository;

    @Autowired
    private MusicRepository musicRepository;

    @Autowired
    private TrackRepository trackRepository;


    public BootstrapData() {
    }

    @Override
    public void run(String... args) throws Exception {

        // SAVE TO REPOSITORIES IN CORRECT ORDER

        // ARTIST
        Track track1 = new Track();
        track1.setName("Fear of the dark");
        trackRepository.save(track1);

        // ALBUM
        Album album1 = new Album();
        album1.setTracks(track1);
        album1.setTitle("Fear of the dark");
        albumRepository.save(album1);

        // MUSIC
        Music music = new Music();
        music.setTracks(track1);
        music.setAlbums(album1);
        musicRepository.save(music);

    }
}
