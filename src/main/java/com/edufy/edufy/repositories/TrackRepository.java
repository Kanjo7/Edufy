package com.edufy.edufy.repositories;

import com.edufy.edufy.models.Artist;
import com.edufy.edufy.models.Track;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TrackRepository extends JpaRepository<Track,Integer> {
    Track findTrackByNameContainsIgnoreCase(@Param("trackName") String trackName);

    @Query("SELECT a FROM Track a JOIN a.genre genre WHERE genre.genreName = :genreName")
    List<Track> findTrackByGenreContainingIgnoreCase(@Param("genreName")String genreName);

    @Query("SELECT a FROM Track a JOIN a.album album WHERE album.title = :albumName")
    List<Track> findTrackByAlbumContainingIgnoreCase(@Param("albumName")String albumName);

    @Query("SELECT a FROM Track a JOIN a.artist track WHERE track.name = :trackName")
    List<Artist> findTrackByArtistContainingIgnoreCase(@Param("trackName")String trackName);


}
