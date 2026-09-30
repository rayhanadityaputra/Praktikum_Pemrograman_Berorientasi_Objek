/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsi;

/**
 *
 * @author ASUS
 */
public class Elektronik extends Produk {
    private int garansi; // Garansi dalam tahun
    
    // Constructor menerima atribut dari superclass dan atribut garansi
    public Elektronik(String namaProduk, double harga, double diskon, int garansi) {
        super(namaProduk, harga, diskon); // Memanggil constructor kelas induk
        this.garansi = garansi;
    }

    public int getGaransi() {
        return garansi;
    }

    public void setGaransi(int garansi) {
        this.garansi = garansi;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo(); // Memanggil tampilkanInfo() kelas induk
        System.out.println("Garansi: " + garansi + " tahun");
    }
}
