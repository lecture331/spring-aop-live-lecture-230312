package com.example.springaoplivelecture230312.auth;

import org.springframework.stereotype.Service;

@Service
public class ProxyAuthentication implements Authentication {
    private RealAuthentication realAuthentication;

    @Override
    public boolean authenticate(String username, String password) {
        if (realAuthentication == null) {
            realAuthentication = new RealAuthentication();
        }
        return realAuthentication.authenticate(username, password);
    }
}