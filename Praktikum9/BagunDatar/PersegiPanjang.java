/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractClass.BagunDatar;

/**
 *
 * @author WINDOWS 10
 */
public class PersegiPanjang extends BangunDatar{
    public double panjang;
    public double lebar;
    
    public double getLuas(){
        return panjang * lebar;
    }
    
    public double getKeliling(){
        return 2 * (panjang + lebar);
    }
    
    public void cetakInfo(){
        System.out.println("Luas Persegi Panjang : " + getLuas());
        System.out.println("Keliling Persegi Panjang : " + getKeliling());
    }
}
