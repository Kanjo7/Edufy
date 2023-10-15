package com.edufy.edufy.repositories;

import com.edufy.edufy.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    User findById(@Param("userId") int userid);
}
