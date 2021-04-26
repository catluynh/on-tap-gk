package com.example.gk;

public class Ghe {
    private String name;
    private String gia;
    private int imgGhe;

    public Ghe(String name, String gia, int imgGhe) {
        this.name = name;
        this.gia = gia;
        this.imgGhe = imgGhe;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public int getImgGhe() {
        return imgGhe;
    }

    public void setImgGhe(int imgGhe) {
        this.imgGhe = imgGhe;
    }
}
