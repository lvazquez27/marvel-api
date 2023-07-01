package com.marvel.developer.marvelapiclient.model.characters.mapper;

import com.marvel.developer.marvelapiclient.model.characters.dto.ComicsDto;
import mx.openpay.marvel_sdk.model.Comics;
import org.mapstruct.Mapper;

@Mapper(
        componentModel = "spring",
        uses ={ItemMapper.class}
)
public interface ComicsMapper {

    ComicsDto toDto(Comics apiModel);
    Comics toApiModel (ComicsDto dto);
}
