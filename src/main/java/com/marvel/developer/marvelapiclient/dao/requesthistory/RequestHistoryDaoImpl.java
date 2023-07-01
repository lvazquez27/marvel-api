package com.marvel.developer.marvelapiclient.dao.requesthistory;

import com.marvel.developer.marvelapiclient.model.requesthistory.dto.RequestHistoryDto;
import com.marvel.developer.marvelapiclient.model.requesthistory.entity.RequestHistoryEntity;
import com.marvel.developer.marvelapiclient.model.requesthistory.mapper.RequestHistoryMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
@RequiredArgsConstructor
public class RequestHistoryDaoImpl implements IRequestHistoryDao{
    private final RequestHistoryRepository repository;
    private final RequestHistoryMapper mapper;
    @Override
    public void create(RequestHistoryDto requestHistory) {
        RequestHistoryEntity entity = this.mapper.toEntity(requestHistory);
        this.repository.save(entity);
        requestHistory.setId(entity.getId());
    }

    @Override
    public List<RequestHistoryDto> listAll() {
        return this.repository.findAll().stream()
                .map(this.mapper::toDto)
                .collect(Collectors.toList());
    }
}
