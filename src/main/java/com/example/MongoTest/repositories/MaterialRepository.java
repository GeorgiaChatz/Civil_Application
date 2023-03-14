package com.example.MongoTest.repositories;

import com.example.MongoTest.tables.Material;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MaterialRepository extends MongoRepository<Material, String> {
}
