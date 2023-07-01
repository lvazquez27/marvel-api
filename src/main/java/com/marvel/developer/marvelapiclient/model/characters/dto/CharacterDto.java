package com.marvel.developer.marvelapiclient.model.characters.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
import java.util.List;

@Setter
@Getter
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CharacterDto {
    public int id;
    public String name;
    public String description;
    public Date modified;
    public ThumbnailDto thumbnail;
    public String resourceURI;
    public ComicsDto comics;
    public SeriesDto series;
    public StoriesDto stories;
    public EventsDto events;
    public List<UrlDto> urls;


}
