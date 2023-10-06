package com.edufy.edufy.services;

import com.edufy.edufy.models.Album;
import com.edufy.edufy.models.Music;

import java.util.List;
import java.util.Optional;

public interface MusicInterface {



    List<Music> getAllMusic();

    Optional<Music> getMusicById(int id);

    Music saveMusic(Music newMusic);

    String deleteMusic(int id);
}

