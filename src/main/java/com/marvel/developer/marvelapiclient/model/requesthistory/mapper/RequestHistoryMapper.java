package com.marvel.developer.marvelapiclient.model.requesthistory.mapper;

import com.marvel.developer.marvelapiclient.model.requesthistory.dto.RequestHistoryDto;
import com.marvel.developer.marvelapiclient.model.requesthistory.entity.RequestHistoryEntity;
import org.mapstruct.Mapper;

@Mapper(
        componentModel = "spring"
)
public interface RequestHistoryMapper {

    RequestHistoryDto toDto(RequestHistoryEntity entity);
    RequestHistoryEntity toEntity(RequestHistoryDto dto);
}
