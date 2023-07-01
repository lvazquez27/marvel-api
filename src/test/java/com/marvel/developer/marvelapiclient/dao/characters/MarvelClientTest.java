package com.marvel.developer.marvelapiclient.dao.characters;

import mx.openpay.marvel_sdk.client.MarvelClient;
import mx.openpay.marvel_sdk.model.ApiResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MarvelClientTest {

    @Autowired
    private MarvelClient mc;

    @Test
    void listCharacters() {
        ApiResponse response = mc.listCharacters();
        assertNotNull(response);
        assertNotNull(response.getData());
        assertEquals(200, response.getCode());
        assertTrue(response.getData().getResults().size() > 0);

    }

    @Test
    void getCharacterById() {

        ApiResponse response = mc.getCharacterById(1010699);
        assertNotNull(response);
        assertNotNull(response.getData());
        assertEquals(200, response.getCode());
        assertEquals(1, response.getData().getResults().size());
    }
}