/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WirelessRouter;

/**
 *
 * @author WINDOWS 10
 */
public class WirelessRouter {
    public String merek, warna;
    public int kecepatan;
    
    public void setMerek (String mrk){
        merek = mrk;
    }
    
    public void setWarna (String wrn){
        warna = wrn;
    }
    
    public void tambahKecepatan (int increment){
        kecepatan += increment;
    }
    
    public void kurangiKecepatan (int decrement){
        kecepatan -= decrement;
    }
    
    public void cetakInfo(){
        System.out.println("Merek \t\t : " + merek);
        System.out.println("Warna \t\t : " + warna);
        System.out.println("Penyimpanan \t : " + kecepatan + " Mbps");
    }
}
