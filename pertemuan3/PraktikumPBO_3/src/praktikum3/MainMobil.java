/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

public class MainMobil {
    public static void main(String[] args) {
        // 1. Menciptakan dua object dari class Mobil
        Mobil mobilPertama = new Mobil("Toyota", "Innova", 2022, "Hitam");
        Mobil mobilKedua = new Mobil("Honda", "Brio", 2023, "Kuning");

        // 2. Menampilkan informasi kedua object
        System.out.println("=== Informasi Awal ===");
        mobilPertama.displayInfo();
        mobilKedua.displayInfo();

        // 3. Memanggil method startEngine pada setiap object
        System.out.println("\n=== Status Mesin ===");
        mobilPertama.startEngine();
        mobilKedua.startEngine();

        // 4. Mengubah warna mobil (menggunakan method setter) dan menampilkan perubahannya
        System.out.println("\n=== Perubahan Warna Mobil ===");
        mobilPertama.setWarna("Putih Mutiara"); // Mengubah warna mobil pertama
        mobilPertama.displayInfo(); // Menampilkan info mobil pertama setelah warnanya diubah
    }
}