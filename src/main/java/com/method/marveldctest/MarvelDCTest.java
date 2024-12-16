package com.method.marveldctest;

import com.method.marveldctest.UIMarvelDC;
import javax.swing.SwingUtilities;

public class MarvelDCTest {
    public static void main(String[] args) {
        // Menggunakan SwingUtilities.invokeLater untuk menjalankan UI di event-dispatching thread
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                // Membuat instance dari UIMarvelDC dan menampilkan jendela
                UIMarvelDC ui = new UIMarvelDC();
                ui.setVisible(true);
            }
        });
    }
}

//test
//test
//test