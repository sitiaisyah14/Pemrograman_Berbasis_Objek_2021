/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlatElektronik;

/**
 *
 * @author WINDOWS 10
 */
public class InterfaceMain {
    public static void main(String[] args) {
        Kipas kipas1 = new Kipas("Kipas Dinding", 450000, "Silver", "Panasonic");
        TV tv1 = new TV("LED(Light-Emited Diode)", 25, 4500000, "Hitam", "Sharp LED TV 32 Inch");
        Kulkas ku1kas1 = new Kulkas(2, 2000000, "Putih", "Polytron Belleza 3 PRM-21QX");
        SmartFridge sf1 = new SmartFridge(3, 4, 5000000, "Hitam", "LG 225L");

    }
}
