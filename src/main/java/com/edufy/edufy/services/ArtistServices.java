package com.edufy.edufy.services;

import com.edufy.edufy.models.Artist;
import com.edufy.edufy.models.Genre;
import com.edufy.edufy.models.Track;
import com.edufy.edufy.repositories.ArtistRepository;
import com.edufy.edufy.repositories.GenreRepository;
import com.edufy.edufy.repositories.TrackRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArtistServices implements ArtistServiceInterface {
    private ArtistRepository artistRepository;
    private GenreRepository genreRepository;
    private final TrackRepository trackRepository;


    public ArtistServices(ArtistRepository artistRepository, GenreRepository genreRepository,
                          TrackRepository trackRepository) {
        this.artistRepository = artistRepository;
        this.genreRepository = genreRepository;
        this.trackRepository = trackRepository;
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

    @Override
    public List<Artist> getArtistsByGenre(int id) {
        return artistRepository.findArtistsByGenre_Id(id);
    }

    @Override
    public List<Artist> getArtistsByGenreName(String genreName) {
        Genre g = genreRepository.findByGenreNameContainingIgnoreCaseOrderById(genreName);
        return artistRepository.findArtistsByGenre_Id(g.getId());
    }


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


    public ArtistRepository getArtistRepository() {
        return artistRepository;
    }

    public void setArtistRepository(ArtistRepository artistRepository) {
        this.artistRepository = artistRepository;
    }

    public GenreRepository getGenreRepository() {
        return genreRepository;
    }

    public void setGenreRepository(GenreRepository genreRepository) {
        this.genreRepository = genreRepository;
    }
}
