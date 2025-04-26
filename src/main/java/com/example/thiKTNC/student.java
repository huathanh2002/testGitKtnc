package com.example.thiKTNC;

public class student {
    private int id;
    private String name;
    private double yearOld;
    private boolean gioiTinh;

    public student() {
    }

    public student(int id, String name, double yearOld, boolean gioiTinh) {
        this.id = id;
        this.name = name;
        this.yearOld = yearOld;
        this.gioiTinh = gioiTinh;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getYearOld() {
        return yearOld;
    }

    public void setYearOld(double yearOld) {
        this.yearOld = yearOld;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
}
