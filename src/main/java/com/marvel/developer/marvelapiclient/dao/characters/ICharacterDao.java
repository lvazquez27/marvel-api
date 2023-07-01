package com.marvel.developer.marvelapiclient.dao.characters;

import com.marvel.developer.marvelapiclient.model.characters.dto.CharacterDto;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICharacterDao {

    List<CharacterDto> listCharacters();
    CharacterDto getById(Integer characterId);
}
