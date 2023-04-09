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
public class DemoPowerbank {
    public static void main(String[] args) {
        
        PowerBank pw = new PowerBank();
        
        System.out.println("=== PowerBank ===");
        pw.setMerek("Jims Honey");
        pw.setWarna("Hitam");
        pw.tambahCapacity(10000);
        pw.kurangiCapacity(200);
        pw.cetakInfo();
    }
}
