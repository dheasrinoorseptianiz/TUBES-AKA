package com.method.marveldctest;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class UIMarvelDC extends JFrame {
    private JTextField txtGenre;
    private JButton btnSearch;
    private JTable table;
    private DefaultTableModel tableModel;
    private ArrayList<DataMarvelDC> films; // Daftar film yang akan dicari

    public UIMarvelDC() {
        // Menginisialisasi daftar film
        films = new ArrayList<>();
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

        // Menyiapkan frame dan layout
        setTitle("Sistem Pencarian Film Berdasarkan Genre");
        setLayout(new BorderLayout());
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Panel untuk input dengan padding dan warna
        JPanel panelInput = new JPanel();
        panelInput.setLayout(new GridLayout(2, 2, 10, 10)); // Tambahkan jarak antar komponen
        panelInput.setBorder(new EmptyBorder(15, 15, 15, 15)); // Padding di sekitar panel
        panelInput.setBackground(new Color(230, 240, 250)); // Warna latar belakang panel

        // Menambahkan input form
        JLabel lblGenre = new JLabel("Genre:");
        lblGenre.setFont(new Font("Arial", Font.BOLD, 14));
        panelInput.add(lblGenre);

        txtGenre = new JTextField();
        panelInput.add(txtGenre);

        // Tombol pencarian
        btnSearch = new JButton("Cari");
        btnSearch.setFont(new Font("Arial", Font.BOLD, 14));
        btnSearch.setBackground(new Color(100, 150, 250)); // Warna latar belakang tombol
        btnSearch.setForeground(Color.WHITE); // Warna teks tombol
        panelInput.add(new JLabel());  // Placeholder untuk grid
        panelInput.add(btnSearch);

        // Menambahkan panel input ke frame
        add(panelInput, BorderLayout.NORTH);

        // Menyiapkan tabel untuk hasil pencarian dengan warna dan font
        tableModel = new DefaultTableModel();
        tableModel.addColumn("Judul");
        tableModel.addColumn("Genre");
        tableModel.addColumn("Durasi");
        tableModel.addColumn("Tahun Rilis");
        tableModel.addColumn("Rating");

        table = new JTable(tableModel);
        table.setRowHeight(25); // Tinggi baris
        table.setFont(new Font("Arial", Font.PLAIN, 12)); // Font tabel
        table.setBackground(Color.WHITE); // Warna latar belakang tabel
        table.setForeground(Color.BLACK); // Warna teks tabel

        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);

        // Menambahkan action listener pada tombol search
        btnSearch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                searchFilm();  // Memanggil fungsi searchFilm saat tombol diclick
            }
        });
    }

    // Fungsi pencarian film berdasarkan genre saja
    private void searchFilm() {
        // Mendapatkan data input dari user
        String genre = txtGenre.getText().toLowerCase();

        // Clear tabel sebelum menambahkan data baru
        tableModel.setRowCount(0);

        // Menambahkan film yang cocok ke dalam tabel
        for (DataMarvelDC film : films) {
            if (!genre.isEmpty() && film.getGenre().toLowerCase().contains(genre)) {
                tableModel.addRow(film.toObjectArray());
            }
        }
    }
}