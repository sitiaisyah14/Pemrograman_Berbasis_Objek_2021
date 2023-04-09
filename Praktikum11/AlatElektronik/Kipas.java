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
public class Kipas extends AlatElektronik{
    private String jenis;
    
    public Kipas(String jenis, double harga, String warna, String merk){
        super(harga, warna, merk);
        this.jenis = jenis;
    }
    
    public String getJenis(){
        return jenis;
    }
    
    public void setJenis(String jenis){
        this.jenis = jenis;
    }
}
