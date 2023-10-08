package com.edufy.edufy.services;

import com.edufy.edufy.models.Artist;
import com.edufy.edufy.models.Genre;
import com.edufy.edufy.repositories.ArtistRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArtistServices implements ArtistServiceInterface {
    private ArtistRepository artistRepository;


    public ArtistServices(ArtistRepository artistRepository) {
        this.artistRepository = artistRepository;
    }

    @Override
    public List<Artist> getAllArtists() {
        return artistRepository.findAll();
    }

    @Override
    public Optional<Artist> getArtistById(int id) {
        return artistRepository.findById(id);
    }

    @Override
    public List<Artist> getArtistsByName(String artist) {
        return artistRepository.findArtistByNameContainingIgnoreCase(artist);
    }

/*    @Override
    public List<Artist> getArtistsByGenre(int id) {
        return artistRepository.findArtistByGenre(id);
    }*/


    @Override
    public Artist createArtist(Artist artistToCreate) {
        return artistRepository.save(artistToCreate);
    }

    @Override
    public Artist updateArtist(Artist artist, int id) {
        Artist a = artistRepository.findById(id).orElseThrow(() -> new RuntimeException());
        a.setName(artist.getName());
        a.setGenre(artist.getGenre());
        artistRepository.save(a);
        return a;
    }

    @Override
    public void deleteArtist(int id) {
        artistRepository.deleteById(id);;
    }


}
