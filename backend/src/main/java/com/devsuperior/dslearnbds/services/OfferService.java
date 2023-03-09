package com.devsuperior.dslearnbds.services;

import com.devsuperior.dslearnbds.models.Offer;
import com.devsuperior.dslearnbds.repositories.OfferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service
public class OfferService {

    @Autowired
    private OfferRepository repository;

    public Offer getOffer(Long id){

        Offer offer = repository.findById(id).orElseThrow(() -> new EntityNotFoundException("Entity not found"));
        return offer;
    }
}
