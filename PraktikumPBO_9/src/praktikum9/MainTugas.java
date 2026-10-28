/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum9;

/**
 *
 * @author ASUS
 */
// 1. Kelas Abstrak Hewan
abstract class Hewan {
    // Metode abstrak
    abstract void suara();
}

// 2. Kelas Turunan Kucing
class Kucing extends Hewan {
    @Override
    void suara() {
        System.out.println("Kucing mengeluarkan suara: Meong");
    }
}

// 3. Kelas Turunan Anjing
class Anjing extends Hewan {
    @Override
    void suara() {
        System.out.println("Anjing mengeluarkan suara: Guk Guk");
    }
}

// 4. Main Class (Nama file harus MainTugas.java)
public class MainTugas {
    public static void main(String[] args) {
        // Polimorfisme: Menggunakan referensi kelas abstrak Hewan
        Hewan kucing = new Kucing();
        Hewan anjing = new Anjing();

        // Memanggil metode suara()
        kucing.suara();
        anjing.suara();
    }
}
