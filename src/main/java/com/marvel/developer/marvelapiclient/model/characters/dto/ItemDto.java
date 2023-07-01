package com.marvel.developer.marvelapiclient.model.characters.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ItemDto {
    public String resourceURI;
    public String name;
    public String type;
}
