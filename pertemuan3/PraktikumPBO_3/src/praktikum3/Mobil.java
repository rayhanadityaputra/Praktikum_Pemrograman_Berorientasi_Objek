/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

public class Mobil {
    // 1. Membuat atribut (termasuk atribut tambahan 'warna' sesuai instruksi modifikasi)
    private String merk;
    private String model;
    private int tahun;
    private String warna;

    // 2. Membuat constructor untuk menerima nilai keempat atribut
    public Mobil(String merk, String model, int tahun, String warna) {
        this.merk = merk;
        this.model = model;
        this.tahun = tahun;
        this.warna = warna;
    }

    // 3. Menambahkan method Getter dan Setter untuk setiap atribut
    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getTahun() {
        return tahun;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    // 4. Membuat method displayInfo() untuk menampilkan informasi lengkap
    public void displayInfo() {
        System.out.println("Mobil " + getMerk() + " " + getModel() + " Tahun " + getTahun() + " - Warna: " + getWarna());
    }

    // 5. Membuat method startEngine()
    public void startEngine() {
        System.out.println("Mesin mobil " + getMerk() + " menyala");
    }
}
