package com.method.marveldctest;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class MarvelDCTest {

    public static void main(String[] args) {
        // Menjalankan antarmuka pengguna (UI)
        SwingUtilities.invokeLater(() -> {
            UIMarvelDC ui = new UIMarvelDC();
            ui.setVisible(true);
        });
    }

    public static void searchFilm(String genre, String selectedMethod, DefaultTableModel tableModel, JLabel lblExecutionTime) {
        // Mendapatkan daftar film dari DataMarvelDC
        ArrayList<DataMarvelDC> films = DataMarvelDC.getFilms();

        // Waktu mulai pencarian
        long startTime = System.nanoTime();

        // Clear tabel sebelum menampilkan hasil baru
        tableModel.setRowCount(0);

        // Pencarian berdasarkan metode yang dipilih
        ArrayList<DataMarvelDC> result;
        if ("Iteratif".equals(selectedMethod)) {
            result = SearchMarvelDC.searchByGenreIterative(films, genre);
        } else {
            result = SearchMarvelDC.searchByGenreRecursive(films, genre, 0, new ArrayList<>());
        }

        // Menampilkan hasil pencarian di tabel
        for (DataMarvelDC film : result) {
            tableModel.addRow(film.toObjectArray());  // Pastikan DataMarvelDC memiliki metode toObjectArray()
        }

        // Waktu selesai pencarian
        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000; // dalam milidetik
        lblExecutionTime.setText("Waktu Eksekusi: " + duration + " ms");
    }
}
