/*
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
        trackRepository.save(track1);

        // ALBUM
        Album album1 = new Album();
        album1.setTitle("Kill em all");
        albumRepository.save(album1);

        // GENRE
        Genre genre1 = new Genre();
        genre1.setGenre("Metal");
        genreRepository.save(genre1);

        // MUSIC
        Music music = new Music();
        music.setArtistList(artist1);
        music.setTrackList(track1);
        music.setAlbumList(album1);
        music.setGenreList(genre1);

        musicRepository.save(music);

    }
}
*/
