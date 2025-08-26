package com.mcqbattlegame.mcqbg.repository;


import com.mcqbattlegame.mcqbg.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> { }
