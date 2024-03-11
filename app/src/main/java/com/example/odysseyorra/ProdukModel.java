package com.example.odysseyorra;

public class ProdukModel {
    private static String tvnamaproduk;
    private static String tvdeskripsi;
    private static Integer gmbrproduk;

    public ProdukModel(String tvnamaproduk, String tvdeskripsi, Integer gmbrproduk) {
        this.tvnamaproduk= tvnamaproduk;
        this.tvdeskripsi = tvdeskripsi;
        this.gmbrproduk = gmbrproduk;
    }

    public static String getTvnamaproduk() {
        return tvnamaproduk;
    }

    public void setTvnamaproduk(String tvnamaproduk) {
        this.tvnamaproduk = tvnamaproduk;
    }

    public static String getTvdeskripsi() {
        return tvdeskripsi;
    }

    public void setTvdeskripsi(String tvdeskripsi) {
        this.tvdeskripsi = tvdeskripsi;
    }

    public static Integer getGmbrproduk() {
        return gmbrproduk;
    }

    public void setGmbrproduk(Integer gmbrproduk) {
        this.gmbrproduk = gmbrproduk;
    }
}

