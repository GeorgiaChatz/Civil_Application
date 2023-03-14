package com.example.MongoTest.tables;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Offer")
public class Offer {
    private String name_off;
    private String job_name;
    private String supplier_name;
    private int fpa;
    private int supplier_value;

    public String getName_off() {
        return name_off;
    }

    public void setName_off(String name_off) {
        this.name_off = name_off;
    }

    public String getJob_name() {
        return job_name;
    }

    public void setJob_name(String job_name) {
        this.job_name = job_name;
    }

    public String getSupplier_name() {
        return supplier_name;
    }

    public void setSupplier_name(String supplier_name) {
        this.supplier_name = supplier_name;
    }

    public int getFpa() {
        return fpa;
    }

    public void setFpa(int fpa) {
        this.fpa = fpa;
    }

    public int getSupplier_value() {
        return supplier_value;
    }

    public void setSupplier_value(int supplier_value) {
        this.supplier_value = supplier_value;
    }
}

