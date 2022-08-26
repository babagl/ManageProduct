package com.example.springbootpart2.repository;

import com.example.springbootpart2.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<Users, Integer> {

    Users findByUsername(String username);

    @Query("SELECT u FROM Users u WHERE u.username=?1")
    Users getUsersByUsername(String Username);
}
