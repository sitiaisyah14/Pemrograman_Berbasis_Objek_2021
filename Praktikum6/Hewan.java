/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_inheritance;

/**
 *
 * @author WINDOWS 10
 */
public class Hewan {
    public String nama;
    public String jenisKelamin;
    public float berat;
    public String lokasi;
    
    public Hewan(){
        System.out.println("===========================================================");
        System.out.println("Macam-Macam Hewan Dengan Jenis dan Ciri Khas yang Berberda");
        System.out.println("===========================================================");
        
    }
    public Hewan(String nama, String jenisKelamin, float berat, String lokasi){
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.berat = berat;
        this.lokasi = lokasi;
    }
    
    public String getInfo(){
        String info = "";
        info += "Nama          : " + nama + "\n";
        info += "Jenis Kelamin : " + jenisKelamin + "\n";
        info += "Berat         : " + berat + " kg \n";
        info += "Lokasi        : " + lokasi + "\n";
        
        return info;
    }
}
