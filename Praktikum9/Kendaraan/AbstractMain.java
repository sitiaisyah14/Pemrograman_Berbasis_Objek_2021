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
public class AbstractMain {
    public static void main(String[] args) {
        System.out.println("==================================");
        System.out.println("    Ciri Sepeda Motor Honda");
        System.out.println("==================================");
        SepedaMotor honda = new SepedaMotor ("ACD06" , "Dua Roda");
        honda.cetakInfo();
        honda.berjalan();
        honda.bersuara();
        
        System.out.println("==================================");
        System.out.println("          Ciri Becak");
        System.out.println("==================================");
        Becak becak1 = new Becak ("tiga roda" , "digayuh");
        becak1.cetakInfo();
        becak1.berjalan();
        becak1.bersuara();
        
    }
}
