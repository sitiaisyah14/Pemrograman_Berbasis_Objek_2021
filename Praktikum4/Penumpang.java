/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TransaksiKeretaApi;

/**
 *
 * @author WINDOWS 10
 */
public class Penumpang {
    private String ktp;
    private String nama;
    private String jenisKel;

    public Penumpang(String ktp, String nama, String jenisKel) {
        this.ktp = ktp;
        this.nama = nama;
        this.jenisKel = jenisKel;
    }
    
    public void setKtp(String ktp){
        this.ktp = ktp;
    }
    
    public String getKtp(){
        return ktp;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setJenisKel(String jenisKel){
        this.jenisKel = jenisKel;
    }
    
    public String getJenisKel(){
        return jenisKel;
    }
    
    public String getInfo() {
        String info = "";
        info += "No KTP        : " + ktp + "\n";
        info += "Nama          : " + nama + "\n";
        info += "Jenis Kelamin : " + jenisKel + "\n";
        return info;
    }
}
