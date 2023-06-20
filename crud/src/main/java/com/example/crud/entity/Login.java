package com.example.crud.entity;

import jakarta.persistence.*;

@Entity
@Table(name="login")
public class Login{
    @Id
    @Column(name="usernames")
    private String username;
    @Column(name = "passwords")
    private String password;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}