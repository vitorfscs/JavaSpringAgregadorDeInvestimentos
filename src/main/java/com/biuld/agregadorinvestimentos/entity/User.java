package com.biuld.agregadorinvestimentos.entity;

import java.time.Instant;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID userId;
    
    @Column(name= "username")
    private String username;

    @Column(name= "email")
    private String email;

    @Column(name= "password")
    private String Password;

    @CreationTimestamp
    private Instant CreationTimestamp;

    @UpdateTimestamp
    private Instant UpdateTimestamp;



    public User() {
    }


    public User(UUID userId, String username, String email, String Password, Instant CreationTimestamp, Instant UpdateTimestamp) {
        this.userId = userId;
        this.username = username;
        this.email = email;
        this.Password = Password;
        this.CreationTimestamp = CreationTimestamp;
        this.UpdateTimestamp = UpdateTimestamp;
    }


    public UUID getUserId() {
        return this.userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public Instant getCreationTimestamp() {
        return this.CreationTimestamp;
    }

    public void setCreationTimestamp(Instant CreationTimestamp) {
        this.CreationTimestamp = CreationTimestamp;
    }

    public Instant getUpdateTimestamp() {
        return this.UpdateTimestamp;
    }

    public void setUpdateTimestamp(Instant UpdateTimestamp) {
        this.UpdateTimestamp = UpdateTimestamp;
    }


}
