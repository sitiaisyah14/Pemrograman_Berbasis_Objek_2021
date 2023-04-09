/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TransaksiKeretaApi;

import java.time.LocalDate;

/**
 *
 * @author WINDOWS 10
 */
public class Main {
    public static void main(String[] args) {
        //data penumpang
        Penumpang p1 = new Penumpang("00123", "Aprilia Faranisa", "Perempuan");
        Penumpang p2 = new Penumpang("00456", "Siti Aisyah", "Perempuan");
        Penumpang p3 = new Penumpang("00789", "Sindy Alvina", "Perempuan");
        Penumpang p4 = new Penumpang("00101", "Fajar Irham", "Laki-laki");
        
        //data 1 gerbong
        Gerbong g1 = new Gerbong("Argo Lawu", "Surabaya", "Malang", "A01", "Gerbong Mawar");
        
        g1.tambahTransaksi(LocalDate.of(2021, 8, 11), "01-667", p1);
        g1.tambahTransaksi(LocalDate.of(2021, 9, 11), "01-668", p2);
        System.out.println(g1.getInfo());
        
        //data 2 gerbong
        Gerbong g2 = new Gerbong("Argo Parahyangan", "Gresik", "Malang", "B02", "Gerbong Anggrek");
        System.out.println(g2.getInfo());
        
        //data 2 gerbong
        Gerbong g3 = new Gerbong("Argo Wisata", "Surabaya", "Gresik", "C03", "Gerbong Melati");
        g3.tambahTransaksi(LocalDate.of(2021, 12, 11), "01-669", p3);
        g3.tambahTransaksi(LocalDate.of(2021, 12, 11), "01-717", p3);
        System.out.println(g3.getInfo());
    }
}
