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
public class DemoWirelessRouter {
    public static void main(String[] args) {
        WirelessRouter wr = new WirelessRouter();
        
        System.out.println("=== Wireless Router ===");
        wr.setMerek("TOTOLINK N300RT Wireless N Router 300Mbps 4 LAN Port");
        wr.setWarna("Silver");
        wr.tambahKecepatan(300);
        wr.kurangiKecepatan(11);
        wr.cetakInfo();
    }
}
