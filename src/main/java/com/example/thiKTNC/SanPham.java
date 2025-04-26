package com.example.thiKTNC;

public class SanPham {

    private String ma;
    private String ten;
    private int namBaoHang;
    private float gia;
    private int soLuong;
    private String danhMuc;

    public SanPham() {
    }

    public SanPham(String ma, String ten, int namBaoHang, float gia, int soLuong, String danhMuc) {
        this.ma = ma;
        this.ten = ten;
        this.namBaoHang = namBaoHang;
        this.gia = gia;
        this.soLuong = soLuong;
        this.danhMuc = danhMuc;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getNamBaoHang() {
        return namBaoHang;
    }

    public void setNamBaoHang(int namBaoHang) {
        this.namBaoHang = namBaoHang;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getDanhMuc() {
        return danhMuc;
    }

    public void setDanhMuc(String danhMuc) {
        this.danhMuc = danhMuc;
    }
}
