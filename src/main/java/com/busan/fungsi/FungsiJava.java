/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.busan.fungsi;

/**
 *
 * @author budi
 */
public class FungsiJava {
    // Fungsi tanpa parameter dan tanpa return value
    static void greeting() {
        System.out.println("Hello! Selamat datang di Java Functions.");
    }

    // Fungsi dengan parameter dan tanpa return value
    static void printMessage(String message) {
        System.out.println("Pesan: " + message);
    }

    // Fungsi tanpa parameter dan dengan return value
    static int tambahSepuluh() {
        int angka = 10;
        return angka + 10;
    }

    // Fungsi dengan parameter dan return value
    static int kaliDua(int angka) {
        return angka * 2;
    }

    public static void main(String[] args) {
        // Memanggil fungsi tanpa parameter dan tanpa return value
        greeting();

        // Memanggil fungsi dengan parameter dan tanpa return value
        printMessage("Ini adalah contoh fungsi dengan parameter.");

        // Memanggil fungsi tanpa parameter dan dengan return value
        int hasilPenambahan = tambahSepuluh();
        System.out.println("Hasil penambahan: " + hasilPenambahan);

        // Memanggil fungsi dengan parameter dan return value
        int hasilPerkalian = kaliDua(5);
        System.out.println("Hasil perkalian: " + hasilPerkalian);
    }
}