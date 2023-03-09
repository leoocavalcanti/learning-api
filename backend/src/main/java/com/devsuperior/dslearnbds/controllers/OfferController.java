package com.devsuperior.dslearnbds.controllers;

import com.devsuperior.dslearnbds.models.Lesson;
import com.devsuperior.dslearnbds.models.Offer;
import com.devsuperior.dslearnbds.services.LessonService;
import com.devsuperior.dslearnbds.services.OfferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/offers")
public class OfferController {

    @Autowired
    private OfferService service;
    @GetMapping("/{id}")
    public ResponseEntity<Offer> getOffer(@PathVariable Long id){

        Offer offer = service.getOffer(id);
        return ResponseEntity.ok(offer);
    }
}
