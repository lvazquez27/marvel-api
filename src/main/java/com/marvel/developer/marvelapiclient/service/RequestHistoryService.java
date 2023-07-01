package com.marvel.developer.marvelapiclient.service;

import com.marvel.developer.marvelapiclient.dao.requesthistory.IRequestHistoryDao;
import com.marvel.developer.marvelapiclient.model.requesthistory.dto.RequestHistoryDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class RequestHistoryService {
    private final IRequestHistoryDao dao;

    public void writeRequest(String path){
        var item = RequestHistoryDto.builder()
                .consultationTime(LocalTime.now())
                .consultationPath(path)
                .build();
        this.dao.create(item);

    }

    public List<RequestHistoryDto> getHistory(){
        return this.dao.listAll();
    }
}
