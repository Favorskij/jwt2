package com.example.jwt2.repository;

import com.example.jwt2.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findUserByUsername(String usrname);

}