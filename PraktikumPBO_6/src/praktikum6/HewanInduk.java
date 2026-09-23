/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6;

// Class Induk Hewan
class Hewan {
    public void bersuara() {
        System.out.println("hewan bersuara");
    }
    public void makan(String makanan) {
        System.out.println("Hewan makan " + makanan);
    }
    public void makan(String makanan, int jumlah) {
        System.out.println("Hewan makan " + jumlah + " porsi " + makanan);
    } 
}

// Class Turunan 1
class Kucing extends Hewan {
    @Override
    public void bersuara() {
        System.out.println("Meow");
    }
}

//Class Turunan 2
class Anjing extends Hewan {
    @Override
    public void bersuara() {
        System.out.println("Woof");
    }
}

public class HewanInduk {
    public static void main (String[] args) {
        System.out.println("----- Kucing -----");
        Hewan hewan = new Kucing();
        hewan.bersuara();
        
        Kucing kucing = new Kucing();
        kucing.makan("ikan");
        kucing.makan("ikan", 2);
        
        System.out.println("\n----- Anjing -----");
        Anjing anjing = new Anjing();
        anjing.bersuara();
        anjing.makan("daging", 3);
    }
}