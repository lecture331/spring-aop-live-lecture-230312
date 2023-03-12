package com.example.springaoplivelecture230312.auth;

public class RealAuthentication implements Authentication {
    @Override
    public boolean authenticate(String username, String password) {
        // 실제 인증 작업 수행
        if (username.equals("admin") && password.equals("admin")) {
            return true;
        }
        return false;
    }
}