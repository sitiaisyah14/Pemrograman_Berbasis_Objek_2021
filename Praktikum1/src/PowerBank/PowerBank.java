/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PowerBank;

/**
 *
 * @author WINDOWS 10
 */
public class PowerBank {
    public String merek, warna;
    public int capacity;
    
    public void setMerek (String mrk){
        merek = mrk;
    }
    
    public void setWarna (String wrn){
        warna = wrn;
    }
    
    public void tambahCapacity (int increment){
        capacity += increment;
    }
    
    public void kurangiCapacity (int decrement){
        capacity -= decrement;
    }
    
    public void cetakInfo(){
        System.out.println("Merek \t : " + merek);
        System.out.println("Warna \t : " + warna);
        System.out.println("Capacity : " + capacity + " mAh");
    }
}
