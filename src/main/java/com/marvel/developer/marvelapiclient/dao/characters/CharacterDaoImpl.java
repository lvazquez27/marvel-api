package com.marvel.developer.marvelapiclient.dao.characters;

import com.marvel.developer.marvelapiclient.model.characters.dto.CharacterDto;
import com.marvel.developer.marvelapiclient.model.characters.mapper.CharacterMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import mx.openpay.marvel_sdk.client.MarvelClient;
import mx.openpay.marvel_sdk.model.ApiResponse;
import mx.openpay.marvel_sdk.model.Result;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
@RequiredArgsConstructor
@Log
public class CharacterDaoImpl implements ICharacterDao{

    private final MarvelClient marvelClient;
    private final CharacterMapper characterMapper;
    @Override
    public List<CharacterDto> listCharacters() {
        ApiResponse response= marvelClient.listCharacters();
        List<Result> resultList = response.getData().getResults();
        return resultList.stream()
                .map(this.characterMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public CharacterDto getById(Integer characterId) {

        CharacterDto response = null;
        try{
            ApiResponse apiResponse = marvelClient.getCharacterById(characterId);
            List<Result> resultList = apiResponse.getData().getResults();

            List<CharacterDto> dtoList = resultList.stream()
                    .map(this.characterMapper::toDto)
                    .collect(Collectors.toList());

            if (dtoList.size() >0){
                response = dtoList.get(0);
            }

        }catch (Exception e){
            log.info(e.getMessage());
        }

        return response;
    }
}
