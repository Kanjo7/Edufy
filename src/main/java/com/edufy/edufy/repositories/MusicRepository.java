package com.edufy.edufy.repositories;

import com.edufy.edufy.models.Music;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MusicRepository extends JpaRepository<Music,Long> {
    List<Music> findAll();

}
