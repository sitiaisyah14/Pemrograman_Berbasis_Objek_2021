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
public class Lingkaran extends BangunDatar{
    public double r;
    
    public double getLuas(){
        return 3.14 * r * r;
    }
    
    public double getKeliling(){
        return 3.14 * 2 * r;
    }
    
    public void cetakInfo(){
        System.out.println("Luas Lingkaran : " + getLuas());
        System.out.println("Keliling Lingkaran : " + getKeliling());
    }
}
