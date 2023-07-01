package com.marvel.developer.marvelapiclient.model.characters.mapper;

import com.marvel.developer.marvelapiclient.model.characters.dto.SeriesDto;
import mx.openpay.marvel_sdk.model.Series;
import org.mapstruct.Mapper;

@Mapper(
        componentModel = "spring",
        uses ={ItemMapper.class}
)
public interface SeriesMapper {
    SeriesDto toDto(Series apiModel);
    Series toApiModel (SeriesDto dto);
}
