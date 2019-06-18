package com.example.recylerview.model;

public class Movie {
    private int image;
    private String title, des;

    // Constructor
    public Movie (int image, String title, String des) {
        this.image = image;
        this.title = title;
        this.des = des;
    }

//    public Movie() {
//
//    }

    // Getter
    public int getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public String getDes() {
        return des;
    }

//    // Setter
//    public void setImage(int image) {
//        this.image = image;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public void setDes(String des) {
//        this.des = des;
//    }
}
