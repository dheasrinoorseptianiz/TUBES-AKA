package com.method.marveldctest;

import java.util.ArrayList;

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

    public static ArrayList<DataMarvelDC> getFilms() {
        ArrayList<DataMarvelDC> films = new ArrayList<DataMarvelDC>();
        films.add(new DataMarvelDC("Iron Man", "Action", "126", "2008", "7.9"));
        films.add(new DataMarvelDC("The Batman", "Action", "175", "2022", "7.8"));
        films.add(new DataMarvelDC("Deadpool and Wolverine", "Comedy", "127", "2024", "7.9"));
        films.add(new DataMarvelDC("Spiderman: No Way Home", "Action", "148", "2021", "8.3"));
        films.add(new DataMarvelDC("Spiderman: Far From Home", "Action", "129", "2019", "7.5"));
        films.add(new DataMarvelDC("Venom", "Action", "112", "2018", "6.7"));
        films.add(new DataMarvelDC("Venom: Let There Be Carnage", "Action", "97", "2021", "6.3"));
        films.add(new DataMarvelDC("Batman v Superman: Dawn of Justice", "Action", "151", "2016", "6.5"));
        films.add(new DataMarvelDC("Wonder Woman", "Action", "141", "2017", "7.4"));
        films.add(new DataMarvelDC("Aquaman", "Action", "143", "2018", "6.9"));
        films.add(new DataMarvelDC("Guardians of the Galaxy", "Action", "121", "2014", "8.0"));
        films.add(new DataMarvelDC("Guardians of the Galaxy Vol.2", "Action", "136", "2017", "7.6"));
        films.add(new DataMarvelDC("Black Panther", "Action", "134", "2018", "7.3"));
        films.add(new DataMarvelDC("The Flash", "Action", "144", "2023", "6.5"));
        films.add(new DataMarvelDC("Doctor Strange", "Action", "115", "2016", "7.5"));
        return films;
    }
}
