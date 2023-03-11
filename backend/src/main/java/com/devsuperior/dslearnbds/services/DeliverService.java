package com.devsuperior.dslearnbds.services;

import com.devsuperior.dslearnbds.dto.DeliverRevisionDTO;
import com.devsuperior.dslearnbds.models.Deliver;
import com.devsuperior.dslearnbds.repositories.DeliverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class DeliverService {

    @Autowired
    private DeliverRepository repository;

    @Transactional
    public void saveRevision(long id, DeliverRevisionDTO dto){

        Deliver deliver = repository.getOne(id);
        deliver.setCorrectCount(dto.getCorrectCount());
        deliver.setStatus(dto.getStatus());
        deliver.setFeedback(dto.getFeedback());
        repository.save(deliver);
    }
}
