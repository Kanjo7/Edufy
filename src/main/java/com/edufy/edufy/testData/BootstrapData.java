package com.edufy.edufy.testData;

import com.edufy.edufy.models.*;
import com.edufy.edufy.repositories.*;
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

    @Autowired
    private GenreRepository genreRepository;

    @Autowired
    private ArtistRepository artistRepository;




    public BootstrapData() {
    }

    @Override
    public void run(String... args) throws Exception {

        // SAVE TO REPOSITORIES IN CORRECT ORDER

        // ARTIST
        Artist artist1 = new Artist();
        artist1.setName("Metallica");
        artistRepository.save(artist1);

        // TRACK
        Track track1 = new Track();
        track1.setName("Whiplash");
        Track track2 = new Track();
        track2.setName("Nothing else matters");
        Track track3 = new Track();
        track3.setName("Four Horsemen");

        trackRepository.save(track1);
        trackRepository.save(track2);
        trackRepository.save(track3);

        // ALBUM
        Album album1 = new Album();
        album1.setTitle("Kill em all");
        album1.setTrackList(track1);
        album1.setTrackList(track3);

        Album album2 = new Album();
        album2.setTitle("Black Album");
        album2.setTrackList(track2);

        albumRepository.save(album1);
        albumRepository.save(album2);

        // GENRE
        Genre genre1 = new Genre();
        genre1.setGenre("Metal");
        genreRepository.save(genre1);

        // MUSIC
        Music music = new Music();
        music.setArtistList(artist1);
        music.setTrackList(track1);
        music.setAlbumList(album1);
        music.setAlbumList(album2);
        music.setGenreList(genre1);

        music.setGenreList(genre1);

        // connect models with media


        artist1.setMusicList(music);
        artistRepository.save(artist1);

        // SAVE MUSIC LAST
        musicRepository.save(music);

    }
}
