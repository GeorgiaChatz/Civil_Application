package com.example.MongoTest.controllers;

import com.example.MongoTest.repositories.JobsRepository;
import com.example.MongoTest.repositories.OfferRepository;
import com.example.MongoTest.tables.Offer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.MongoTest.tables.Jobs;

import java.util.List;

@RestController
@RequestMapping("/offer")
public class OfferController {
    @Autowired
    private OfferRepository repository;

    @PostMapping
    public Offer addOffer(@RequestBody Offer offer) {
        return repository.save(offer);
    }

    @GetMapping
    public List<Offer> getAllOffers() {
        return repository.findAll();
    }

}
