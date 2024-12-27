package com.method.marveldctest;

import java.util.ArrayList;

public class SearchMarvelDC {
    
    // Metode pencarian iteratif
    public static ArrayList<DataMarvelDC> searchByGenreIterative(ArrayList<DataMarvelDC> films, String genre) {
        ArrayList<DataMarvelDC> result = new ArrayList<>();
        for (int i = 0; i < films.size(); i++) {
            DataMarvelDC film = films.get(i);
            if (film.getGenre().equals(genre)) {
                result.add(film);
            }
        }
        return result;
    }

    // Metode pencarian rekursif
    public static ArrayList<DataMarvelDC> searchByGenreRecursive(ArrayList<DataMarvelDC> films, String genre, int index, ArrayList<DataMarvelDC> result) {
        if (index == 0) { 
            DataMarvelDC film = films.get(index);
            if (film.getGenre().equals(genre)) {
                result.add(film);
            }
            return result;
        } else { 
            DataMarvelDC film = films.get(index);
            if (film.getGenre().equals(genre)) {
                result.add(film);
            }
            return searchByGenreRecursive(films, genre, index - 1, result);
        }
    }
}
