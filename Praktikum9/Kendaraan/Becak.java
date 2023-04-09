/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractClass.Kendaraan;

/**
 *
 * @author WINDOWS 10
 */
public class Becak extends Kendaraan{
    public String tigaRoda;
    public String gayuh;
    
    public Becak(String tigaRoda, String gayuh){
        this.tigaRoda = tigaRoda;
        this.gayuh = gayuh;
    }
    
    public void cetakInfo(){
        System.out.println("-  Becak berjalan dengan " + gayuh);
    }

    @Override
    public void berjalan() {
        System.out.println("-  Berjalan menggunakan " + tigaRoda);
    }

    @Override
    public void bersuara() {
        System.out.println("-  Bersuara kring kring kring");
    }  
}
