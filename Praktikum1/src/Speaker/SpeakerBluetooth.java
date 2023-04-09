/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Speaker;

/**
 *
 * @author WINDOWS 10
 */
public class SpeakerBluetooth extends Speaker{
    public String koneksi;
    
    public void setKoneksi (String newValue){
        koneksi =  newValue;
    }
    
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("Koneksi : " + koneksi);
    }
}
