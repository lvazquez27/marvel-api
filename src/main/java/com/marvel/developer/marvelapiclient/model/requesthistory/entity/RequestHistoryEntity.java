package com.marvel.developer.marvelapiclient.model.requesthistory.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalTime;

@Setter
@Getter
@Entity
@Table(name ="request_history")
public class RequestHistoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="consultation_time", columnDefinition = "TIME")
    private LocalTime consultationTime;

    @Column(name="consultation_path")
    private String consultationPath;
}
