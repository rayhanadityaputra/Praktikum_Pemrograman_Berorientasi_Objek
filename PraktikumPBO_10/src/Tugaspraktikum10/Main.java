/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugaspraktikum10;

/**
 *
 * @author ASUS
 */

public class Main {
    public static void main(String[] args) {
        // Menentukan contoh harga produk
        double hargaElektronik = 5000000.0;
        double hargaMakanan = 50000.0;

        // Membuat objek Elektronik dan Makanan
        Pembayaran laptop = new Elektronik();
        Pembayaran snack = new Makanan();

        // Menghitung pajak masing-masing produk
        double pajakLaptop = laptop.hitungPajak(hargaElektronik);
        double pajakSnack = snack.hitungPajak(hargaMakanan);

        // Menampilkan hasil perhitungan
        System.out.println("=== Sistem Pembayaran Toko ===");
        System.out.println("Harga Laptop        : Rp " + hargaElektronik);
        System.out.println("Pajak Laptop (10%)  : Rp " + pajakLaptop);
        System.out.println("---------------------------------");
        System.out.println("Harga Snack         : Rp " + hargaMakanan);
        System.out.println("Pajak Snack (5%)    : Rp " + pajakSnack);
    }
}