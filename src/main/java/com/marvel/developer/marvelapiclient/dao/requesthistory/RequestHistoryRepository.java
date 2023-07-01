package com.marvel.developer.marvelapiclient.dao.requesthistory;

import com.marvel.developer.marvelapiclient.model.requesthistory.entity.RequestHistoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RequestHistoryRepository extends JpaRepository<RequestHistoryEntity, Long> {
}
