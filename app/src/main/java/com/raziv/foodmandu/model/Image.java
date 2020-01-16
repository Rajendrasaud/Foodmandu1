package com.raziv.foodmandu.model;

public class Image {
    private String imagename;

    public Image(String image) {
        this.imagename = image;
    }

    public String getName() {
        return imagename;
    }

    public void setName(String name) {
        this.imagename = name;
    }
}

