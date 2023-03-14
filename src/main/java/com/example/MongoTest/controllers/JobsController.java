package com.example.MongoTest.controllers;

import com.example.MongoTest.repositories.JobsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.MongoTest.tables.Jobs;

import java.util.List;

@RestController
@RequestMapping("/jobs")
public class JobsController {
    @Autowired
    private JobsRepository repository;

    @PostMapping
    public Jobs addJob(@RequestBody Jobs job) {
        return repository.save(job);
    }

    @GetMapping
    public List<Jobs> getAllJobs() {
        return repository.findAll();
    }

}
