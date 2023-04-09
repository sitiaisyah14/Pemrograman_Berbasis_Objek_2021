/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractClass.BagunDatar;

/**
 *
 * @author WINDOWS 10
 */
public class AbstractClassMain {
    public static void main(String[] args) {
        //Persegi
        System.out.println("==========================");
        System.out.println("          Persegi ");
        System.out.println("==========================");
        Persegi persegi1 = new Persegi();
        persegi1.sisi = 3;
        persegi1.getLuas();
        persegi1.getKeliling();
        persegi1.cetakInfo();
        
        //Persegi Panjang
        System.out.println("==========================");
        System.out.println("      Persegi Panjang ");
        System.out.println("==========================");
        PersegiPanjang pp1 = new PersegiPanjang();
        pp1.lebar = 5;
        pp1.panjang = 10;
        pp1.getLuas();
        pp1.getKeliling();
        pp1.cetakInfo();
        
        //Lingkaran
        System.out.println("==========================");
        System.out.println("       Lingkaran ");
        System.out.println("==========================");
        Lingkaran ling1 = new Lingkaran();
        ling1.r = 7;
        ling1.getLuas();
        ling1.getKeliling();
        ling1.cetakInfo();
    }
}
