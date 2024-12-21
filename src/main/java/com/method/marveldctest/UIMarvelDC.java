package com.method.marveldctest;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class UIMarvelDC extends JFrame {
    private JTextField txtGenre;
    private JLabel lblExecutionTime;
    private DefaultTableModel tableModel;
    private JTable table;

    public UIMarvelDC() {
        // Menyiapkan frame dan layout
        setTitle("Sistem Pencarian Film Berdasarkan Genre");
        setLayout(new BorderLayout());
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Panel untuk input dengan padding dan warna
        JPanel panelInput = new JPanel();
        panelInput.setLayout(new GridLayout(3, 2, 20, 20)); // Tambahkan jarak antar komponen
        panelInput.setBackground(new Color(230, 240, 250)); // Warna latar belakang panel
        panelInput.setBorder(new EmptyBorder(20, 20, 20, 20)); // Menambahkan margin di sekeliling panel

        // Menambahkan input form
        JLabel lblGenre = new JLabel("Genre:");
        panelInput.add(lblGenre);

        txtGenre = new JTextField();
        panelInput.add(txtGenre);

        // Tombol pencarian iteratif
        JButton btnIterative = new JButton("Iteratif");
        panelInput.add(new JLabel());  // Placeholder untuk grid
        panelInput.add(btnIterative);

        // Tombol pencarian rekursif
        JButton btnRecursive = new JButton("Rekursif");
        panelInput.add(new JLabel());  // Placeholder untuk grid
        panelInput.add(btnRecursive);

        // Menambahkan panel input ke frame
        add(panelInput, BorderLayout.NORTH);

        // Menyiapkan tabel untuk hasil pencarian
        tableModel = new DefaultTableModel();
        tableModel.addColumn("Judul");
        tableModel.addColumn("Genre");
        tableModel.addColumn("Durasi");
        tableModel.addColumn("Tahun Rilis");
        tableModel.addColumn("Rating");

        table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);

        // Label untuk menampilkan waktu eksekusi
        lblExecutionTime = new JLabel("Waktu Eksekusi: ");
        add(lblExecutionTime, BorderLayout.SOUTH);

        // Tombol untuk pencarian iteratif
        btnIterative.addActionListener(e -> {
            String genre = txtGenre.getText().toLowerCase();
            MarvelDCTest.searchFilm(genre, "Iteratif", tableModel, lblExecutionTime);
        });

        // Tombol untuk pencarian rekursif
        btnRecursive.addActionListener(e -> {
            String genre = txtGenre.getText().toLowerCase();
            MarvelDCTest.searchFilm(genre, "Rekursif", tableModel, lblExecutionTime);
        });
    }
}
