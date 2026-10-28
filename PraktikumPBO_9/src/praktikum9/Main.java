/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum9;

// 1. Kelas Abstrak Kendaraan
abstract class Kendaraan {
    // Metode abstrak
    abstract void berjalan();
    
    // Metode dengan implementasi
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

// 3. Kelas Turunan Sepeda
class Sepeda extends Kendaraan {
    @Override
    void berjalan() {
        System.out.println("Sepeda sedang berjalan dengan pelan.");
    }
}

// 4. Main Class (Nama file harus Main.java)
public class Main {
    public static void main(String[] args) {
        Kendaraan mobil = new Mobil();
        Kendaraan sepeda = new Sepeda();
        
        mobil.berjalan();
        mobil.info();
        
        sepeda.berjalan();
        sepeda.info();
    }
}