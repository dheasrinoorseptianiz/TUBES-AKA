package com.method.marveldctest;

import java.util.ArrayList;

public class SearchMarvelDC {
    // Metode pencarian iteratif
    public static ArrayList<DataMarvelDC> searchByGenreIterative(ArrayList<DataMarvelDC> films, String genre) {
        ArrayList<DataMarvelDC> result = new ArrayList<>();
        for (int i = 0; i < films.size(); i++) {
            DataMarvelDC film = films.get(i);
            if (film.getGenre().toLowerCase().equals(genre)) {
                result.add(film);
            }
        }
        return result;
    }

    // Metode pencarian rekursif
    public static ArrayList<DataMarvelDC> searchByGenreRecursive(ArrayList<DataMarvelDC> films, String genre, int index, ArrayList<DataMarvelDC> result) {
        // Kondisi dasar: jika sudah mencapai akhir list, mengembalikan hasil
        if (index >= films.size()) {
            return result;
        }

        // Mendapatkan film pada indeks saat ini
        DataMarvelDC film = films.get(index);

        // Meriksa apakah genre cocok (case-insensitive)
        if (film.getGenre().toLowerCase().contains(genre)) {
            result.add(film);
        }
        // Memanggil rekursif untuk elemen berikutnya
        return searchByGenreRecursive(films, genre, index + 1, result);
    }
}


