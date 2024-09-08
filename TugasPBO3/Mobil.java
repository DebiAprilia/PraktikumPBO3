/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPBO3;

/**
 *
 * @author user
 */
//atribut dari class Mobil
//dibuat menjadi private
public class Mobil {
    private String merk;
    private String model;
    private int tahun;
    private String warna; //menambahkan atribut baru
    
    //Constructor untuk menerima nilai dari ketiga atribut
    public Mobil(String merk, String model, int tahun){
        this.merk = merk;
        this.model = model;
        this.tahun = tahun;
    }
    //Menambahkan method getter dan setter pada setiap atribut
    public String getMerk(){
        return merk;
    }
    public void setMerk(String merk){
        this.merk = merk;
    }
    public String getModel(){
        return model;
    }
    public void setModel(){
        this.model = model;
    }
    public int getTahun(){
        return tahun;
    }
    public void setTahun(){
        this.tahun = tahun;
    }
    //Menambahkan method getter dan setter untuk atribut warna
    public String getWarna(){
        return warna;
    }
    public void setWarna(String warnaBaru){
        this.warna = warnaBaru;
    }
    //Method displayinfo() untuk menampilkan informasi lengkap mobil
    void displayinfo(){
        System.out.println("Merk : " + merk);
        System.out.println("Model : " + model);
        System.out.println("Tahun : " + tahun);
        System.out.println("Warna : " + warna + "\n"); //tambahkan untuk menampilkan warna
    }
    //Menambahkan Method startEngine()
    void startEngine(){
        System.out.println("Mesin Mobil " + merk + " Menyala.");
    }
}
