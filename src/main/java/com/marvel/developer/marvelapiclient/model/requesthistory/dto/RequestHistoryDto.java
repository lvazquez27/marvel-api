package com.marvel.developer.marvelapiclient.model.requesthistory.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.time.LocalTime;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RequestHistoryDto {

    private Long id;
    private LocalTime consultationTime;
    private String consultationPath;

}
