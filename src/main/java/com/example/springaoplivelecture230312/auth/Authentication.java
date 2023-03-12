package com.example.springaoplivelecture230312.auth;

public interface Authentication {
    boolean authenticate(String username, String password);
}