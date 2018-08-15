package com.mostafa.fci.tourguideapp;

public class Place {
    //Variables
    private String name;
    private String description;
    private int imageResourceId;
    // Object Constructor
    public Place(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }
    //Object Methods
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public int getImageResourceId() {
        return imageResourceId;
    }
}
