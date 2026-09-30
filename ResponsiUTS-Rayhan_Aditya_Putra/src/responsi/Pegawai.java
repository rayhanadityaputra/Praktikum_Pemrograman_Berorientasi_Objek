/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsi;

/**
 *
 * @author ASUS
 */
public class Pegawai {
    // Enkapsulasi menggunakan akses modifier private
    private String namaPegawai;
    private double gaji;
    private double pajak; // Penambahan atribut pajak dalam persen (%)

    // Constructor
    public Pegawai(String namaPegawai, double gaji, double pajak) {
        this.namaPegawai = namaPegawai;
        this.gaji = gaji;
        this.pajak = pajak;
    }

    // Getter dan Setter
    public String getNamaPegawai() {
        return namaPegawai;
    }

    public void setNamaPegawai(String namaPegawai) {
        this.namaPegawai = namaPegawai;
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }
    
    public double getPajak() {
        return pajak;
    }

    public void setPajak(double pajak) {
        this.pajak = pajak;
    }
    
    // Penambahan metode perhitungan gaji bersih setelah dipotong pajak
    public double hitungGajiBersih() {
        return gaji - (gaji * (pajak / 100.0));
    }

    // Metode untuk menampilkan informasi pegawai
    public void tampilkanInfo() {
        System.out.println("Nama Pegawai: " + namaPegawai);
        System.out.println("Gaji: " + (long) gaji);
        if (pajak > 0) {
            System.out.println("Gaji Bersih (Pajak " + pajak + "%): " + (long) hitungGajiBersih());
        }
    }
}