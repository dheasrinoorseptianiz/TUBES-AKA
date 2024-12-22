package com.method.marveldctest;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class MarvelDCTest {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            UIMarvelDC ui = new UIMarvelDC();
            ui.setVisible(true);
        });
    }

    public static void searchFilm(String genre, String selectedMethod, DefaultTableModel tableModel, JLabel lblExecutionTime) {
        // Mendapatkan daftar film
        ArrayList<DataMarvelDC> films = DataMarvelDC.getFilms();

        // Mulai pengukuran waktu
        long startTime = System.nanoTime();

        // Pencarian berdasarkan metode
        ArrayList<DataMarvelDC> result;
        if ("Iteratif".equals(selectedMethod)) {
            result = SearchMarvelDC.searchByGenreIterative(films, genre);
        } else {
            result = SearchMarvelDC.searchByGenreRecursive(films, genre, 0, new ArrayList<>());
        }

        // Akhiri pengukuran waktu
        long endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1_000_000.0; // Konversi ke milidetik

        // Tampilkan hasil di tabel
        tableModel.setRowCount(0); // Hapus data lama
        for (DataMarvelDC film : result) {
            tableModel.addRow(film.toObjectArray());
        }
        // Tampilkan waktu eksekusi
        lblExecutionTime.setText(String.format("Waktu Eksekusi (%s): %.3f ms", selectedMethod, duration));

        // Jika tidak ada hasil
        if (result.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Tidak ada film ditemukan dengan genre: " + genre, "Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
