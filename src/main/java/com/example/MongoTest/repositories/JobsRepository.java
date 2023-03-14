package com.example.MongoTest.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.MongoTest.tables.Jobs;

public interface JobsRepository extends MongoRepository<Jobs, String> {
}
