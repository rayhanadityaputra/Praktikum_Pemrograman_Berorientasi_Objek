/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsi;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
       // Deklarasi objek-objek 
        Produk produk1 = new Elektronik("Laptop MSI", 15000000, 10.0, 2); 
        Produk produk2 = new Makanan("Doritos", 20000, 5.0, "2999-01-30");

        Pegawai pegawai1 = new PegawaiTetap("Rayhan Aditya", 5000000, 5.0, 1000000); 
        Pegawai pegawai2 = new PegawaiKontrak("Yunus Wibowo", 3000000, 2.5, 12);

        Produk produk3 = new Elektronik("Iphone 100 Ultra Pro Max", 1500000000, 0, 2); 
        
        // 1. Output Produk
        System.out.println("===== 1. Output Produk =====");
        produk1.tampilkanInfo();

        System.out.println();

        // 2. Output Pegawai
        System.out.println("===== 2. Output Pegawai =====");
        pegawai1.tampilkanInfo();

        System.out.println(); 

        // 3. Output Polimorfisme
        System.out.println("===== 3. Output Polimorfisme =====");
        produk2.tampilkanInfo();
        System.out.println("---------------------------");
        pegawai2.tampilkanInfo();
        
        System.out.println(); 
        
        System.out.println("===== Overloading =====");
        produk3.keterangan("E-001");
        produk3.tampilkanInfo();
        produk3.keterangan(3);
    }
}
