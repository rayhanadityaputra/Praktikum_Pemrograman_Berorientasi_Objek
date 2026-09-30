/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsi;

/**
 *
 * @author ASUS
 */
public class Produk {
    // Enkapsulasi menggunakan akses modifier private
    private String namaProduk;
    private double harga;
    private double diskon; // Penambahan atribut diskon dalam persen (%)

    // Constructor
    public Produk(String namaProduk, double harga, double diskon) {
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.diskon = diskon;
    }

    // Getter dan Setter
    public String getNamaProduk() {
        return namaProduk;
    }

    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
    
    public double getDiskon() {
        return diskon;
    }

    public void setDiskon(double diskon) {
        this.diskon = diskon;
    }
    
    // Penambahan metode perhitungan harga setelah diskon
    public double hitungHargaDiskon() {
        return harga - (harga * (diskon / 100.0));
    }
    
    // Contoh untuk metode Overloading sederhana
    public void keterangan(String idBarang) {
        System.out.println("Order ID: " + idBarang); 
    }
    
    public void keterangan(int jumlahBarang) {
        System.out.println("Jumlah beli: " + jumlahBarang); 
    }

    // Metode untuk menampilkan informasi produk
    public void tampilkanInfo() {
        System.out.println("Nama Produk: " + namaProduk);
        System.out.println("Harga: " + (long) harga);
        if (diskon > 0) {
            System.out.println("Harga Setelah Diskon (" + diskon + "%): " + (long) hitungHargaDiskon());
        }
    }
}