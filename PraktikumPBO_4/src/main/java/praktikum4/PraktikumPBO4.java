/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

public class PraktikumPBO4 {
    public static void main(String[] args) {
        // Membuat objek dari subclass Mobil
        Mobil mobilBaru = new Mobil("Honda Civic", 200, "Bensin", 4);

        // Memanggil method dari superclass (Kendaraan)
        System.out.println("--- Info Kendaraan ---");
        mobilBaru.tampilkanInfoKendaraan();
        
        // Memanggil method dari subclass (Mobil)
        System.out.println("\n--- Info Spesifik Mobil ---");
        mobilBaru.tampilkanInfoMobil();
    }
}