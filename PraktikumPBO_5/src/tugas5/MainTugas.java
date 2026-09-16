/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas5;

// ==========================================
// BAGIAN 1: PEWARISAN & OVERRIDING (HEWAN)
// ==========================================

// 1. Kelas Induk Hewan
class Hewan {
    String nama;
    String jenis;

    public void tampilkanInfo() {
        System.out.println("Nama Hewan: " + nama);
        System.out.println("Jenis: " + jenis);
    }
}

// 2. Kelas Turunan Kucing
class Kucing extends Hewan {
    // Metode untuk suara khas kucing
    public void suara() {
        System.out.println("Suara: Meow Meow");
    }

    // Overriding metode tampilkanInfo
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo(); // Memanggil tampilkanInfo dari kelas Hewan
        suara(); // Memanggil metode suara khas kucing
    }
}

// 3. Kelas Turunan Anjing
class Anjing extends Hewan {
    // Metode untuk suara khas anjing
    public void suara() {
        System.out.println("Suara: Guk Guk");
    }

    // Overriding metode tampilkanInfo
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo(); 
        suara(); 
    }
}


// ==========================================
// BAGIAN 2: HIERARKI PEWARISAN 3 LEVEL
// ==========================================

// Level 1: Kelas Induk Paling Atas
class Kendaraan {
    String nama;

    public void tampilkanInfo() {
        System.out.println("Nama Kendaraan: " + nama);
    }
}

// Level 2: Kelas Menengah (Turunan dari Kendaraan)
class KendaraanDarat extends Kendaraan {
    int jumlahRoda;

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Kategori: Darat");
        System.out.println("Jumlah Roda: " + jumlahRoda);
    }
}

// Level 3: Kelas Turunan Paling Bawah (Dari KendaraanDarat)
class Mobil extends KendaraanDarat {
    int jumlahPintu;

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah Pintu: " + jumlahPintu);
    }
}

class SepedaMotor extends KendaraanDarat {
    String jenisMesin;

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jenis Mesin: " + jenisMesin);
    }
}


// ==========================================
// MAIN CLASS UNTUK MENJALANKAN PROGRAM
// ==========================================
public class MainTugas {
    public static void main(String[] args) {
        System.out.println("--- TUGAS HEWAN ---");
        
        Kucing kucing = new Kucing();
        kucing.nama = "Cuplis";
        kucing.jenis = "Persia";
        kucing.tampilkanInfo();
        
        System.out.println();
        
        Anjing anjing = new Anjing();
        anjing.nama = "Planet Destroyer";
        anjing.jenis = "Bulldog";
        anjing.tampilkanInfo();

        System.out.println("\n--- TUGAS KENDARAAN (3 LEVEL) ---");
        
        Mobil mobil = new Mobil();
        mobil.nama = "Alfa Romeo 33 Stradale";
        mobil.jumlahRoda = 4; // Diwarisi dari KendaraanDarat
        mobil.jumlahPintu = 2; // Milik kelas Mobil
        mobil.tampilkanInfo();
        
        System.out.println();
        
        SepedaMotor motor = new SepedaMotor();
        motor.nama = "Vespa";
        motor.jumlahRoda = 2; // Diwarisi dari KendaraanDarat
        motor.jenisMesin = "Matic"; // Milik kelas SepedaMotor
        motor.tampilkanInfo();
    }
}