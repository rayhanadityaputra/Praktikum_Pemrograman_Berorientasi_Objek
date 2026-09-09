/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

public class Pekerja extends Manusia {
    // Atribut tambahan dengan modifier private
    private int gaji;

    // Constructor untuk menginisialisasi atribut dari superclass dan subclass
    public Pekerja(String nama, int usia, String pekerjaan, int gaji) {
        super(nama, usia, pekerjaan); // Memanggil constructor Manusia
        this.gaji = gaji;
    }

    // Getter untuk gaji
    public int getGaji() {
        return gaji;
    }

    // Setter untuk gaji
    public void setGaji(int gaji) {
        this.gaji = gaji;
    }

    // Override metode toString()
    @Override
    public String toString() {
        return "Nama Pekerja: " + getNama() + "\n" +
               "Usia: " + usia + " tahun\n" +
               "Pekerjaan: " + pekerjaan + "\n" +
               "Gaji: Rp" + gaji;
    }
}