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

import java.util.List;

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


        // ALBUM
        Album album1 = new Album();
        album1.setTitle("Fear of the Dark");
        albumRepository.save(album1);

        // TRACK
        Track track1 = new Track();
        track1.setName("Chains of Misery");
        track1.setAlbum(album1);

        Track track2 = new Track();
        track2.setName("Be Quick or Be Dead");
        track2.setAlbum(album1);

        Track track3 = new Track();
        track3.setName("From Here to Eternity");
        track3.setAlbum(album1);

        trackRepository.save(track1);
        trackRepository.save(track2);
        trackRepository.save(track3);

        // MUSIC
        Music music = new Music();
        //music.setTracks(track1);
        //music.setAlbums(album1);
        musicRepository.save(music);


        album1.setTracks(track1);
        album1.setTracks(track2);
        album1.setTracks(track3);
        albumRepository.save(album1);


        /*
        // TEST
        track1.setName("Chains of Misery");
        track1.setAlbum(album1);
        track2.setName("Be Quick or Be Dead");
        track2.setAlbum(album1);
        track3.setName("From Here to Eternity");
        track3.setAlbum(album1);
        trackRepository.save(track1);
        trackRepository.save(track2);
        trackRepository.save(track3);

        album1.setTracks(track1);
        album1.setTracks(track2);
        album1.setTracks(track3);
        albumRepository.save(album1);

         */
    }
}
