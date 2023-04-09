/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlatElektronik;

/**
 *
 * @author WINDOWS 10
 */
public class Kulkas extends AlatElektronik{
    private int jumlahPintu;
    
    public Kulkas(int jumlahPintu, double harga, String warna, String merk){
        super(harga, warna, merk);
        this.jumlahPintu = jumlahPintu;
    }
    
    public void setJumlahPintu(int jumlahPintu){
        this.jumlahPintu = jumlahPintu;
    }
    
    public int getJumlahPintu(){
        return jumlahPintu;
    }
}
