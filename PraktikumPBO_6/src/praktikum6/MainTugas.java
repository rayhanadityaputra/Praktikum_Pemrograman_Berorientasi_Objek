/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6;

import java.util.ArrayList;
import java.util.List;

// 1. Buat kelas abstrak Produk dengan atribut nama dan harga
abstract class Produk {
    protected String nama;
    protected double harga;

    public Produk(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    // Metode abstrak untuk di-override
    public abstract double hitungDiskon();
}

// 2. Buat kelas turunan Buku
class Buku extends Produk {
    public Buku(String nama, double harga) {
        super(nama, harga);
    }

    // Override metode hitungDiskon() (Misal: diskon 10%)
    @Override
    public double hitungDiskon() {
        return harga * 0.10; 
    }
}

// 2. Buat kelas turunan Elektronik
class Elektronik extends Produk {
    public Elektronik(String nama, double harga) {
        super(nama, harga);
    }

    // Override metode hitungDiskon() (Misal: diskon 5%)
    @Override
    public double hitungDiskon() {
        return harga * 0.05;
    }
}

// 2. Buat kelas turunan Pakaian
class Pakaian extends Produk {
    public Pakaian(String nama, double harga) {
        super(nama, harga);
    }

    // Override metode hitungDiskon() (Misal: diskon 15%)
    @Override
    public double hitungDiskon() {
        return harga * 0.15;
    }
}

// 3. Buat kelas KeranjangBelanja
class KeranjangBelanja {
    // Menyimpan list of Produk
    private List<Produk> listProduk;

    public KeranjangBelanja() {
        listProduk = new ArrayList<>();
    }

    // Metode untuk memasukkan produk ke dalam keranjang
    public void tambahProduk(Produk produk) {
        listProduk.add(produk);
    }

    // Metode untuk menghitung total harga setelah diskon
    public double hitungTotalHargaSetelahDiskon() {
        double total = 0;
        for (Produk produk : listProduk) {
            // Harga produk dikurangi nominal diskonnya
            double hargaSetelahDiskon = produk.getHarga() - produk.hitungDiskon();
            total += hargaSetelahDiskon;
        }
        return total;
    }
    
    // Metode untuk menampilkan detail keranjang
    public void cetakStruk() {
        System.out.println("=== STRUK BELANJA ===");
        for (Produk produk : listProduk) {
            double diskon = produk.hitungDiskon();
            double hargaAkhir = produk.getHarga() - diskon;
            System.out.println("- " + produk.getNama() + " (Harga: " + produk.getHarga() + ", Diskon: " + diskon + ") -> Rp" + hargaAkhir);
        }
        System.out.println("---------------------");
        System.out.println("TOTAL BAYAR : Rp" + hitungTotalHargaSetelahDiskon());
    }
}

// Kelas Utama untuk Menjalankan Program
public class MainTugas {
    public static void main(String[] args) {
        KeranjangBelanja keranjang = new KeranjangBelanja();
        
        // Memasukkan berbagai macam produk ke dalam keranjang (Polimorfisme)
        keranjang.tambahProduk(new Buku("Buku Pemrograman Java", 100000));
        keranjang.tambahProduk(new Elektronik("Mouse Wireless", 250000));
        keranjang.tambahProduk(new Pakaian("Kemeja Flanel", 150000));
        
        // Menghitung dan menampilkan total
        keranjang.cetakStruk();
    }
}
