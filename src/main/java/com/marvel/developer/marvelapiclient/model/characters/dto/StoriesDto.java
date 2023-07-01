package com.marvel.developer.marvelapiclient.model.characters.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Setter
@Getter
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StoriesDto {
    public int available;
    public String collectionURI;
    public List<ItemDto> items;
    public int returned;
}
