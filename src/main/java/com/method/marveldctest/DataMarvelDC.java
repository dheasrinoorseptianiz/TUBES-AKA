package com.method.marveldctest;

public class DataMarvelDC {
    private String judul;
    private String genre;
    private String durasi;
    private String tahunRilis;
    private String rating;

    public DataMarvelDC(String judul, String genre, String durasi, String tahunRilis, String rating) {
        this.judul = judul;
        this.genre = genre;
        this.durasi = durasi;
        this.tahunRilis = tahunRilis;
        this.rating = rating;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDurasi() {
        return durasi;
    }

    public void setDurasi(String durasi) {
        this.durasi = durasi;
    }

    public String getTahunRilis() {
        return tahunRilis;
    }

    public void setTahunRilis(String tahunRilis) {
        this.tahunRilis = tahunRilis;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public Object[] toObjectArray() {
        return new Object[]{judul, genre, durasi, tahunRilis, rating};
    }
}