package com.marvel.developer.marvelapiclient.service;

import com.marvel.developer.marvelapiclient.dao.characters.ICharacterDao;
import com.marvel.developer.marvelapiclient.model.characters.dto.CharacterDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CharacterService {

    private final ICharacterDao characterDao;

    public List<CharacterDto> listCharacters(){

        return this.characterDao.listCharacters();
    }

    public CharacterDto getById (Integer characterId){

        return this.characterDao.getById(characterId);
    }
}
