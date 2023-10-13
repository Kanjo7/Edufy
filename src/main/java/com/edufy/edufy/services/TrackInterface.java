package com.edufy.edufy.services;

import com.edufy.edufy.models.Artist;
import com.edufy.edufy.models.Track;

import java.util.List;

public interface TrackInterface {

    Track getTrackByName(String trackName);

    Track updateTracks(Track track, int id);

    List<Artist> getArtistByTrack(String trackname);
}
