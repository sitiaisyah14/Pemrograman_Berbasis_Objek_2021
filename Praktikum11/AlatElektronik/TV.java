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
public class TV extends AlatElektronik implements Audible{
    private String jenisLayar;
    private int volume;
    
    public TV(String jenisLayar, int volume, double harga, String warna, String merk){
        super(harga, warna, merk);
        this.jenisLayar = jenisLayar;
        this.volume = volume;
    }
    
    public String getJenisLayar(){
        return jenisLayar;
    }
    
    public void setJenisLayar(String jenisLayar){
        this.jenisLayar = jenisLayar;
    }

    @Override
    public void naikkanVolume() {
        System.out.println("Tekan tombol untuk menaikkan volume");}

    @Override
    public void turunkanVolume() {
        System.out.println("Tekan tombol untuk menurunkan volume");
    }
}
