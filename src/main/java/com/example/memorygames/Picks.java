package com.example.memorygames;

public class Picks {

    String name, eng_name;
    int image;


    public Picks(String name, int image) {
        this.name = name;
        this.image = image;
    }

    public String getName() {
        return name;
    }


    public int getImage() {
        return image;
    }


    public Picks(String name, String eng_name, int image) {
        this.name = name;
        this.eng_name = eng_name;
        this.image = image;
    }

    public String getEng_name() {
        return eng_name;
    }

}
