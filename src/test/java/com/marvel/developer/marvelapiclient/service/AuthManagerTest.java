package com.marvel.developer.marvelapiclient.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AuthManagerTest {

    @Autowired
    private AuthManager authManager;

    @Test
    void authenticateRequest() {
    }

    @Test
    void getUserDataFromBasicToken() {
        String basicTokenFromClient ="Basic YWRtaW46MTIz";
        String username ="admin";
        String password ="123";

        String[] credentials = this.authManager.getUserDataFromBasicToken(basicTokenFromClient);

        assertEquals(username, credentials[0]);
        assertEquals(password, credentials[1]);
    }
}