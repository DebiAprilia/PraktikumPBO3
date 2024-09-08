/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPBO3;

/**
 *
 * @author user
 */
// Membuat class main dan dua objek
public class Main {
    public static void main(String[] args) {
        Mobil Abi = new Mobil("Toyota", "Fortuner", 2020);
        Mobil Bani = new Mobil("Suzuki", "Jimny", 2023);
        
        //Untuk menampilkan informasi kedua objek
        Abi.displayinfo();
        Bani.displayinfo();
        
        //Untuk menampilkan hasil dari method startEngine()
        Abi.startEngine();
        Bani.startEngine();
        
        //Untuk mengubah dan menampilkan warna mobil
        Abi.setWarna("Merah");
        Abi.displayinfo();
        
        Bani.setWarna("Kuning");
        Bani.displayinfo();
    }
}
