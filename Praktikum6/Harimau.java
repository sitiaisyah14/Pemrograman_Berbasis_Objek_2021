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
public class Harimau extends Hewan{
    public String jenis;
    public String makanan;
    public String suara;
    
    //Overloading : Method Sama pada Class Sama
    public Harimau(){
        System.out.println("              Ini Ciri adalah Hewan Harimau" );
        System.out.println("             -------------------------------");
    }
    
    public Harimau(String nama, String jenisKelamin, float berat, String lokasi, String jenis, String makanan, String suara){
        super(nama, jenisKelamin, berat, lokasi);
        this.jenis = jenis;
        this.makanan = makanan;
        this.suara = suara;
    }
    
    //Overiding : Method sama dengan Class Parent
    public String getInfo(){
        String info = "";
        info += "Jenis         : " + jenis + "\n";
        info += "Makanan       : " + makanan + "\n";
        info += "Suara         : " + suara + "\n";
        return info;
    }
    
    public String getAllInfo(){
        String info = super.getInfo();
        info += this.getInfo();
        
        return info ;
    }
}
