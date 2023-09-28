package com.edufy.edufy.testData;

import com.edufy.edufy.models.Album;
import com.edufy.edufy.models.Artist;
import com.edufy.edufy.models.Music;
import com.edufy.edufy.repositories.AlbumRepository;
import com.edufy.edufy.repositories.ArtistRepository;
import com.edufy.edufy.repositories.MusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class BootstrapData implements CommandLineRunner {

    @Autowired
    private AlbumRepository albumRepository;

    @Autowired
    private MusicRepository musicRepository;

    @Autowired
    private ArtistRepository artistRepository;

    public BootstrapData() {
    }

    @Override
    public void run(String... args) throws Exception {

        // ARTIST
        Artist artist1 = new Artist();
        artist1.setName("Iron Maiden");
        artistRepository.save(artist1);

        // ALBUM
        Album album1 = new Album();
        Set<Artist> artists = new HashSet<>();
        album1.setArtists(artists);
        album1.setTitle("Fear of the dark");
        albumRepository.save(album1);

        // MUSIC
        Music music = new Music();

        music.setArtists(artists);

        Set<Album> albums = new HashSet<>();
        albums.add(album1);
        music.setAlbums(albums);

        // SAVE TO REPOSITORIES IN CORRECT ORDER


        musicRepository.save(music);
    }
}
