package com.example.springaoplivelecture230312.auth;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ProxyAuthenticationTest {

    @Autowired
    private Authentication proxyAuthentication;

    @Test
    public void testAuthenticateWithCorrectCredentials() {
        boolean isAuthenticated = proxyAuthentication.authenticate("admin", "admin");
        Assertions.assertTrue(isAuthenticated);
    }

    @Test
    public void testAuthenticateWithIncorrectCredentials() {
        boolean isAuthenticated = proxyAuthentication.authenticate("user", "password");
        Assertions.assertFalse(isAuthenticated);
    }
}