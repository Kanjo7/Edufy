package com.edufy.edufy.repositories;

import com.edufy.edufy.models.DislikedMedia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DislikedMediaRepository extends JpaRepository<DislikedMedia, Integer> {

    List<DislikedMedia> findDislikedMediaByUser_Id(@Param("userId") int id);
}
