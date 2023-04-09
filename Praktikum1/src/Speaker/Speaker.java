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
public class Speaker {
    public String merek, warna;
    public int volume;
    
    public void setMerek (String mrk){
        merek = mrk;
    }
    
    public void setWarna (String wrn){
        warna = wrn;
    }
    
    public void tambahVolume (int increment){
        volume += increment;
    }
    
    public void kurangiVolume (int decrement){
        volume -= decrement;
    }
    
    public void cetakInfo(){
        System.out.println("Merek \t : " + merek);
        System.out.println("Warna \t : " + warna);
        System.out.println("Volume \t : " + volume);
    }
}
