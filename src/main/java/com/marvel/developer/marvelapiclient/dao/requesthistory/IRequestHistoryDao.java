package com.marvel.developer.marvelapiclient.dao.requesthistory;

import com.marvel.developer.marvelapiclient.model.requesthistory.dto.RequestHistoryDto;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IRequestHistoryDao {

    void create(RequestHistoryDto requestHistory);
    List<RequestHistoryDto> listAll();

}
