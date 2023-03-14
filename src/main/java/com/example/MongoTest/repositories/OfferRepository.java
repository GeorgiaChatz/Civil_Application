package com.example.MongoTest.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.MongoTest.tables.Offer;

public interface OfferRepository extends MongoRepository<Offer, String> {
}
