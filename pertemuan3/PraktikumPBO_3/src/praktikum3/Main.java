/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

public class Main {
    public static void main(String[] args) {
        // Menggunakan constructor untuk mengisi nama dan umur langsung saat objek dibuat
        Hewan kucing = new Hewan("Mimi", 3);
        kucing.suara();
        kucing.info();

        // Membuat objek baru bernama anjing dan memanggil method berlari()
        Hewan anjing = new Hewan("Boni", 4);
        anjing.berlari();
        anjing.info();
    }
}