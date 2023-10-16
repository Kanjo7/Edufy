package com.edufy.edufy.repositories;

import com.edufy.edufy.models.MediaInterface;
import com.edufy.edufy.models.MediaType;
import com.edufy.edufy.models.Podhost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PodhostRepository extends JpaRepository<Podhost, Integer> {
    List<MediaInterface> findAllByMediaType(MediaType mediaType);

}


