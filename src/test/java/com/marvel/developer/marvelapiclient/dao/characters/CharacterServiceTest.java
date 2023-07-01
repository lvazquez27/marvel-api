package com.marvel.developer.marvelapiclient.dao.characters;

import com.marvel.developer.marvelapiclient.model.characters.dto.CharacterDto;
import com.marvel.developer.marvelapiclient.service.CharacterService;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;



@SpringBootTest
public class CharacterServiceTest {

    @MockBean
    ICharacterDao characterDao;

    @Autowired
    CharacterService characterService;

    @Test
    void listAllService(){
        CharacterDto mockCharacter = new CharacterDto();

        mockCharacter.setId(1011334);
        mockCharacter.setName("3-D Man");
        mockCharacter.setModified(new Date());

        List<CharacterDto> mockCharacters = new ArrayList<>();
        mockCharacters.add(mockCharacter);

        Mockito.when(characterDao.listCharacters()).thenReturn(mockCharacters);
        List<CharacterDto> characters = this.characterService.listCharacters();
        assertNotNull(characters);
        assertTrue(characters.size()>0);
        assertNotNull(characters.get(0));
        CharacterDto assertionCharacter = characters.get(0);
        assertEquals(1011334,assertionCharacter.getId());
        assertEquals("3-D Man", assertionCharacter.getName());
        assertInstanceOf(Date.class, assertionCharacter.getModified());

    }
}
