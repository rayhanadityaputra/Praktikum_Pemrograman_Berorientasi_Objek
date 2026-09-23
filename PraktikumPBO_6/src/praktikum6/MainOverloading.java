/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6;

class HewanOverloading {
    public void bersuara() {
        System.out.println("Hewan bersuara");
    }
    
    public void makan(String makanan) {
        System.out.println("Hewan makan " + makanan);
    }
    
    public void makan(String makanan, int jumlah) {
        System.out.println("Hewan makan " + jumlah + " porsi " + makanan);
    } 
}

public class MainOverloading {
    public static void main(String[] args) {
        System.out.println("--- Overloading ---");
        HewanOverloading kucing = new HewanOverloading();
        
        kucing.bersuara();
        kucing.makan("ikan");          // Memanggil metode dengan 1 parameter
        kucing.makan("ikan", 2);       // Memanggil metode dengan 2 parameter
    }
}   
