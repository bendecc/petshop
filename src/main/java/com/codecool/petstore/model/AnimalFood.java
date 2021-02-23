package com.codecool.petstore.model;

import java.util.Date;

public class AnimalFood {

    private long id;
    private String name;
    private Brand brand;
    private AnimalFoodType type;
    private Date expirationDate;

    public AnimalFood(long id, String name, Brand brand, AnimalFoodType type, Date expirationDate) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.type = type;
        this.expirationDate = expirationDate;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public AnimalFoodType getType() {
        return type;
    }

    public void setType(AnimalFoodType type) {
        this.type = type;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }
}