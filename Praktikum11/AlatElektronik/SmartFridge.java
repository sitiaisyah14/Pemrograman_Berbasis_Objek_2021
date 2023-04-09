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
public class SmartFridge extends Kulkas implements Audible{
    private int volume;
    
    public SmartFridge(int volume, int jumlahPintu, double harga, String warna, String merk){
        super(jumlahPintu, harga, warna, merk);
        this.volume = volume;
    }

    @Override
    public void naikkanVolume() {
        System.out.println("Tekan tombol untuk menaikkan volume");
    }

    @Override
    public void turunkanVolume() {
        System.out.println("Tekan tombol untuk menurunkan volume");
    }
}
