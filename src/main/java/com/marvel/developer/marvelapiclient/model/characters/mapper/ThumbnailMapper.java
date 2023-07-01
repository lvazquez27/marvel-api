package com.marvel.developer.marvelapiclient.model.characters.mapper;

import com.marvel.developer.marvelapiclient.model.characters.dto.ThumbnailDto;
import mx.openpay.marvel_sdk.model.Thumbnail;
import org.mapstruct.Mapper;

@Mapper(
        componentModel = "spring"
)
public interface ThumbnailMapper {
    ThumbnailDto toDto(Thumbnail apiModel);
    Thumbnail toApiModel (ThumbnailDto dto);
}
