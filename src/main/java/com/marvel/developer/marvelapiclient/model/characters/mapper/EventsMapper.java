package com.marvel.developer.marvelapiclient.model.characters.mapper;

import com.marvel.developer.marvelapiclient.model.characters.dto.EventsDto;
import mx.openpay.marvel_sdk.model.Events;
import org.mapstruct.Mapper;

@Mapper(
        componentModel = "spring"
)
public interface EventsMapper {

    EventsDto toDto(Events apiModel);
    Events toApiModel (EventsDto dto);
}
