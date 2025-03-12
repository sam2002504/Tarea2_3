package com.example.tarea23;

public class Photograph {
    private byte[] image;
    private String description;

    public Photograph(byte[] image, String description) {
        this.image = image;
        this.description = description;
    }

    public byte[] getImage() {
        return image;
    }

    public String getDescription() {
        return description;
    }
}
