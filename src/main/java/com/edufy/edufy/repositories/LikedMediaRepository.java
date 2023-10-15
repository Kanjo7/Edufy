package com.edufy.edufy.repositories;

import com.edufy.edufy.models.LikedMedia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LikedMediaRepository extends JpaRepository<LikedMedia, Integer> {

    List<LikedMedia> findLikedMediaByUser_Id(@Param("userId") int id);
}
