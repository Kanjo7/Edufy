package com.edufy.edufy.repositories;

import com.edufy.edufy.models.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlbumRepository extends JpaRepository<Album,Integer> {
}
