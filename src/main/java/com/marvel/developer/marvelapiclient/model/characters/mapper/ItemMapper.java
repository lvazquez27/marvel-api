package com.marvel.developer.marvelapiclient.model.characters.mapper;

import com.marvel.developer.marvelapiclient.model.characters.dto.ItemDto;
import mx.openpay.marvel_sdk.model.Item;
import org.mapstruct.Mapper;

@Mapper(
        componentModel = "spring"
)
public interface ItemMapper {

    ItemDto toDto(Item apiModel);
    Item toApiModel (ItemDto dto);

}
