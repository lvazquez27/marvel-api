package com.marvel.developer.marvelapiclient.dao.characters;

import com.marvel.developer.marvelapiclient.model.characters.dto.CharacterDto;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class MarvelClientMockitoTest {

    @MockBean
    ICharacterDao characterDao;

    @Test
    void listAllCharacters(){
        Mockito.when(characterDao.listCharacters()).thenReturn(new ArrayList<>());

        List<CharacterDto> characters = this.characterDao.listCharacters();
        assertNotNull(characters);
        assertEquals(0,characters.size());
    }

    @Test
    void getCharacterById(){
        Mockito.when(characterDao.getById(ArgumentMatchers.anyInt()))
                .thenReturn(null);
        CharacterDto character = this.characterDao.getById(1);
        assertNull(character);
    }
}
