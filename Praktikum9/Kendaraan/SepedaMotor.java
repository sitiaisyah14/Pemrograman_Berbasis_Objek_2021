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
public class SepedaMotor extends Kendaraan{
    public String nomor;
    public String duaRoda;
    
    public SepedaMotor(String nomor, String duaRoda){
        this.nomor = nomor;
        this.duaRoda = duaRoda;
    }

    public void cetakInfo(){
        System.out.println("-  Sepeda Motor ini memiliki plat nomor " + nomor);
    }
    
    @Override
    public void berjalan() {
        System.out.println("-  Sepeda Motor dapat berjalan dengan roda yang berjumlah " + duaRoda);
    }

    @Override
    public void bersuara() {
        System.out.println("-  Sepeda motor bersuara bremm bremm bremm");
    }  
}
