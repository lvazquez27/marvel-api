package com.marvel.developer.marvelapiclient.model.characters.mapper;

import com.marvel.developer.marvelapiclient.model.characters.dto.StoriesDto;
import mx.openpay.marvel_sdk.model.Stories;
import org.mapstruct.Mapper;

@Mapper(
        componentModel = "spring",
        uses ={ItemMapper.class}
)
public interface StoriesMapper {
    StoriesDto toDto(Stories apiModel);
    Stories toApiModel (StoriesDto dto);
}
