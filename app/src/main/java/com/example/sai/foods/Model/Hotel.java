package com.example.sai.foods.Model;

/**
 * Created by sai on 28-Mar-18.
 */

public class Hotel {
    private String Name;
    private String Image;

    public Hotel(){
    }

    public Hotel(String name, String image) {
        Name = name;
        Image = image;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }
}
