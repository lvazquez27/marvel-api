package com.marvel.developer.marvelapiclient.model.characters.mapper;

import com.marvel.developer.marvelapiclient.model.characters.dto.CharacterDto;
import mx.openpay.marvel_sdk.model.Result;
import org.mapstruct.Mapper;

@Mapper(
        componentModel = "spring",
        uses = {
                ThumbnailMapper.class,
                ComicsMapper.class,
                SeriesMapper.class,
                StoriesMapper.class,
                EventsMapper.class,
                UrlMapper.class

        }
)
public interface CharacterMapper {
    CharacterDto toDto(Result apiModel);
    Result toApiModel (CharacterDto dto);
}
