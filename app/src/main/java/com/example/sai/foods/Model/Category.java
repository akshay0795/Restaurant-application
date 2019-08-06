package com.example.sai.foods.Model;

/**
 * Created by sai on 10/02/2018.
 */

public class Category {
    private String HotelId;
    private String Name;
    private String Image;

    public Category(){
    }

    public Category(String name, String image, String hotelId) {
        HotelId = hotelId;
        Name = name;
        Image = image;
    }

    public String getHotelId() {
        return HotelId;
    }

    public void setHotelId(String hotelId) {
        HotelId = hotelId;
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
