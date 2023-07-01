package com.marvel.developer.marvelapiclient.model.characters.mapper;

import com.marvel.developer.marvelapiclient.model.characters.dto.UrlDto;
import mx.openpay.marvel_sdk.model.Url;
import org.mapstruct.Mapper;

@Mapper(
        componentModel = "spring"
)
public interface UrlMapper {
    UrlDto toDto(Url apiModel);
    Url toApiModel (UrlDto dto);
}

