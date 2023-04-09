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
public class Persegi extends BangunDatar{
    public double sisi;
    
    public double getLuas(){
        return sisi * sisi;
    }
    
    public double getKeliling(){
        return 4 * sisi;
    }
    
    public void cetakInfo(){
        System.out.println("Luas Persegi : " + getLuas());
        System.out.println("Keliling Persegi : " + getKeliling());
    }
}
