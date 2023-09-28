package com.edufy.edufy.repositories;

import com.edufy.edufy.models.Artist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistRepository extends JpaRepository<Artist,Long> {
}
