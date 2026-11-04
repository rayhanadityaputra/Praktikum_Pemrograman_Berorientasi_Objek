/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugaspraktikum10;

/**
 *
 * @author ASUS
 */

public class Elektronik implements Pembayaran {
    @Override
    public double hitungPajak(double harga) {
        // Pajak 10% dari harga
        return harga * 0.10;
    }
}