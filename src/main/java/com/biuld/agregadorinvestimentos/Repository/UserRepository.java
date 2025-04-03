package com.biuld.agregadorinvestimentos.Repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.biuld.agregadorinvestimentos.entity.User;


public interface UserRepository extends JpaRepository<User, UUID>{

}
