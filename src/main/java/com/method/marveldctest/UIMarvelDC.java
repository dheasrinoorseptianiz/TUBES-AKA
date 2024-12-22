package com.method.marveldctest;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

public class UIMarvelDC extends JFrame {
    private JTextField txtGenre;
    private JLabel lblExecutionTime;
    private DefaultTableModel tableModel;
    private JTable table;

    public UIMarvelDC() {
        // Pengaturan frame
        setTitle("Sistem Pencarian Film Berdasarkan Genre");
        setLayout(new BorderLayout());
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Panel input
        JPanel panelInput = new JPanel();
        panelInput.setLayout(new GridLayout(3, 2, 20, 20));
        panelInput.setBackground(new Color(230, 240, 250));
        panelInput.setBorder(new EmptyBorder(20, 20, 20, 20));

        // Input genre
        JLabel lblGenre = new JLabel("Genre:");
        panelInput.add(lblGenre);

        txtGenre = new JTextField();
        panelInput.add(txtGenre);

        // Tombol Iteratif
        JButton btnIterative = new JButton("Iteratif");
        panelInput.add(new JLabel());  // Placeholder
        panelInput.add(btnIterative);

        // Tombol Rekursif
        JButton btnRecursive = new JButton("Rekursif");
        panelInput.add(new JLabel());  // Placeholder
        panelInput.add(btnRecursive);

        add(panelInput, BorderLayout.NORTH);

        // Tabel hasil
        tableModel = new DefaultTableModel();
        tableModel.addColumn("Judul");
        tableModel.addColumn("Genre");
        tableModel.addColumn("Durasi");
        tableModel.addColumn("Tahun Rilis");
        tableModel.addColumn("Rating");

        table = new JTable(tableModel);
        table.setAutoCreateRowSorter(true);
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);

        // Label waktu eksekusi
        lblExecutionTime = new JLabel("Waktu Eksekusi: ");
        lblExecutionTime.setBorder(new EmptyBorder(10, 10, 10, 10));
        add(lblExecutionTime, BorderLayout.SOUTH);

        // Listener tombol iteratif
        btnIterative.addActionListener(e -> {
            performSearch("Iteratif");
        });

        // Listener tombol rekursif
        btnRecursive.addActionListener(e -> {
            performSearch("Rekursif");
        });

        // Tampilkan semua data saat aplikasi pertama kali dijalankan
        displayAllData();
    }

    // Menampilkan semua data di tabel
    private void displayAllData() {
        ArrayList<DataMarvelDC> films = DataMarvelDC.getFilms(); // Ambil semua data film
        tableModel.setRowCount(0); // Pastikan tabel kosong sebelum menambahkan data
        for (DataMarvelDC film : films) {
            tableModel.addRow(film.toObjectArray());
        }
        lblExecutionTime.setText("Semua data telah dimuat.");
    }

    private void performSearch(String method) {
        String genre = txtGenre.getText().trim().toLowerCase();

        // Validasi input
        if (genre.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Genre tidak boleh kosong!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Panggil metode pencarian
        MarvelDCTest.searchFilm(genre, method, tableModel, lblExecutionTime);
    }
}
