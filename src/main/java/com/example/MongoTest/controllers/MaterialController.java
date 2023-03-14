package com.example.MongoTest.controllers;

import com.example.MongoTest.repositories.JobsRepository;
import com.example.MongoTest.repositories.MaterialRepository;
import com.example.MongoTest.tables.Material;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.MongoTest.tables.Jobs;

import java.util.List;

@RestController
@RequestMapping("/material")
public class MaterialController {
    @Autowired
    private MaterialRepository repository;

    @PostMapping
    public Material addMaterial(@RequestBody Material material) {
        return repository.save(material);
    }

    @GetMapping
    public List<Material> getAllMaterials() {
        return repository.findAll();
    }

}
