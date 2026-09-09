/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

public class MainTugas {
    public static void main(String[] args) {
        // 1. Membuat objek Pekerja
        Pekerja pekerja1 = new Pekerja("Budi", 30, "Programmer", 15000000);

        // 2. Menampilkan informasi awal menggunakan toString()
        System.out.println("--- Informasi Awal ---");
        System.out.println(pekerja1.toString());

        // 3. Mengubah nama menggunakan setter
        pekerja1.setNama("Budi Santoso");

        // Menampilkan ulang informasi pekerja setelah nama diubah
        System.out.println("\n--- Informasi Setelah Diubah ---");
        System.out.println(pekerja1.toString());

        // 4. Uji coba akses langsung (Penjelasan ada di bawah)
        System.out.println("\n--- Uji Coba Akses Langsung ---");
        // System.out.println(pekerja1.nama); // Akan error jika di-uncomment
        // System.out.println(pekerja1.gaji); // Akan error jika di-uncomment
        System.out.println("Akses usia (berhasil): " + pekerja1.usia); 
        System.out.println("Akses pekerjaan (berhasil): " + pekerja1.pekerjaan);
    }
}
