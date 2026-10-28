/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum9;

/**
 *
 * @author ASUS
 */
// 1. Kelas Abstrak Kendaraan
abstract class Kendaraan {
    abstract void berjalan();
    
    void info() {
        System.out.println("Ini adalah kendaraan.");
    }
}

// 2. Kelas Turunan Mobil
class Mobil extends Kendaraan {
    @Override
    void berjalan() {
        System.out.println("Mobil sedang berjalan dengan cepat.");
    }
}

// 3. Main Class (Nama file: Main.java)
public class MainError {
    public static void main(String[] args) {
        // Pembuktian 1: Instansiasi melalui kelas turunan (BERHASIL)
        Kendaraan mobil = new Mobil();
        mobil.berjalan();

        // Pembuktian 2: Mencoba instansiasi langsung dari kelas abstrak Kendaraan (ERROR)
        
        // Kendaraan k = new Kendaraan(); // <-- Error Compile Time!
    }
}