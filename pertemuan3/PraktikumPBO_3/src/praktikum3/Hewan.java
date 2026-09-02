/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

public class Hewan {
    // 1. Mengubah atribut menjadi private (Encapsulation)
    private String nama;
    private int umur;

    // 2. Membuat Constructor untuk inisialisasi awal
    public Hewan(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    // 3. Menambahkan Getter dan Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    // Method suara yang sudah ada
    void suara() {
        System.out.println("Hewan bersuara");
    }

    // 4. Menambahkan method info()
    void info() {
        System.out.println("Nama: " + getNama() + ", Umur: " + getUmur());
    }

    // 5. Menambahkan method berlari()
    void berlari() {
        System.out.println("Hewan sedang berlari");
    }
}