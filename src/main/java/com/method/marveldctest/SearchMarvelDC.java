package com.method.marveldctest;

import java.util.ArrayList;

public class SearchMarvelDC {
    // Metode pencarian iteratif
    public static ArrayList searchByGenreIterative(ArrayList films, String genre) {
        ArrayList result = new ArrayList();
        for (int i = 0; i < films.size(); i++) {
            DataMarvelDC film = (DataMarvelDC) films.get(i);
            if (film.getGenre().toLowerCase().contains(genre)) {
                result.add(film);
            }
        }
        return result;
    }

    // Metode pencarian rekursif
    public static ArrayList searchByGenreRecursive(ArrayList films, String genre, int index, ArrayList result) {
        if (index >= films.size()) {
            return result;
        }

        DataMarvelDC film = (DataMarvelDC) films.get(index);
        if (film.getGenre().toLowerCase().contains(genre)) {
            result.add(film);
        }

        return searchByGenreRecursive(films, genre, index + 1, result);
    }
}

