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
public class DemoSpeaker {
    public static void main(String[] args) {
        SpeakerBluetooth sb1 = new SpeakerBluetooth();
        SpeakerSystem ss1 = new SpeakerSystem();
        
        System.out.println("=== Speaker Bluetooth ===");
        sb1.setMerek("JBL Charge Mini 2+ J006 Wireless");
        sb1.setWarna("Merah");
        sb1.setKoneksi("Bluetooth 5.0");
        sb1.tambahVolume(50);
        sb1.kurangiVolume(5);
        sb1.cetakInfo();
        
        System.out.println("");
        
        System.out.println("=== Speaker System ===");
        ss1.setMerek("Polytron");
        ss1.setWarna("Hitam Silver");
        ss1.setKoneksi("USB");
        ss1.tambahVolume(30);
        ss1.kurangiVolume(5);
        ss1.cetakInfo();
    }
}
