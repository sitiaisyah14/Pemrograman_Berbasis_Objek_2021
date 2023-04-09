/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_inheritance;

/**
 *
 * @author WINDOWS 10
 */
public class Main {
    public static void main(String[] args) {
        //Object 1 Harimau
        Harimau harimau1 = new Harimau();
        harimau1.nama = "Panthera tigris sondaica";
        harimau1.jenisKelamin = "Jantan";
        harimau1.berat = 84 ;
        harimau1.lokasi = "Sumatra - Indonesia";
        harimau1.jenis = "Herbivora";
        harimau1.makanan = "Daging";
        harimau1.suara = "Mengaung";
        System.out.println(harimau1.getAllInfo());
        
        //Object 1 Beruang
        Beruang beruang1 = new Beruang();
        beruang1.nama = "Beruang Madu";
        beruang1.jenisKelamin = "Betina";
        beruang1.berat = 52 ;
        beruang1.lokasi = "hutan hujan tropis - Asia Tenggara";
        beruang1.jenis = "Herbivora dan Karnivora";
        beruang1.makanan = "Mamalia kecil, ujung pohon palem, dan buah-buahan";
        beruang1.suara = "Menderam";
        System.out.println(beruang1.getAllInfo());
        
        //Object 2 Beruang
        Beruang beruang2 = new Beruang();
        beruang2.nama = "Beruang Coklat (Ursus arctos)";
        beruang2.jenisKelamin = "Jantan";
        beruang2.berat = 289 ;
        beruang2.lokasi = "Kanada, Alaska, dan barat laut Amerika Serikat";
        beruang2.jenis = "Herbivora";
        beruang2.makanan = "Daging (Rusa Besar dan Karibu)";
        beruang2.suara = "Menderam";
        System.out.println(beruang2.getAllInfo());
    }
}
