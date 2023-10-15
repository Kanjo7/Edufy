package com.edufy.edufy.repositories;

import com.edufy.edufy.models.UserMediaHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMediaHistoryRepository extends JpaRepository<UserMediaHistory, Integer> {

    List<UserMediaHistory> findUserMediaHistoryByUser_Id(@Param("userId") int id);
}
