/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TransaksiKeretaApi;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author WINDOWS 10
 */
public class Gerbong {
    private String namaKereta;
    private String kotaAsal;
    private String kotaTujuan;
    private String noGerbong;
    private String namaGerbong;
    private ArrayList<Transaksi> riwayatTransaksi;
    
    public Gerbong(String namaKereta, String kotaAsal, String kotaTujuan,String noGerbong, String namaGerbong){
        this.namaKereta = namaKereta;
        this.kotaAsal = kotaAsal;
        this.kotaTujuan = kotaTujuan;
        this.noGerbong = noGerbong;
        this.namaGerbong = namaGerbong;
        this.riwayatTransaksi = new ArrayList<>();
    }
    
    public void tambahTransaksi(LocalDate tanggal, String noTrans, Penumpang penumpang){
        Transaksi transaksi = new Transaksi();
        transaksi.setTanggal(tanggal);
        transaksi.setNoTrans(noTrans);
        transaksi.setPenumpang(penumpang);
        riwayatTransaksi.add(transaksi);
    }
    
    public String getNamaKereta(){
        return namaKereta;
    }
    
    public void setNamaKereta(String namaKereta){
        this.namaKereta = namaKereta;
    }
    
    public String getKotaAsal(){
        return kotaAsal;
    }
    
    public void setKotaAsal(String kotaAsal){
        this.kotaAsal = kotaAsal;
    }
    
    public String getKotaTujuan(){
        return kotaTujuan;
    }
    
    public void setKotaTujuan(String kotaTujuan){
        this.kotaTujuan = kotaTujuan;
    }
    
    public String getNoGerbong(){
        return noGerbong;
    }
    
    public void setNoGerbong(String noGerbong){
        this.noGerbong = noGerbong;
    }
    
    public String getNamaGerbong(){
        return namaGerbong;
    }
    
    public void setNamaGerbong(String namaGerbong){
        this.namaGerbong = namaGerbong;
    }
    
    public String getInfo(){
        String info = "";
        info += "======================================= \n";
        info += "   Nama Kereta    : " + this.namaKereta + "\n";
        info += "   Kota Asal      : " + this.kotaAsal + "\n";
        info += "   Kota Tujuan    : " + this.kotaTujuan + "\n";
        info += "   No Gerbong     : " + this.noGerbong + "\n";
        info += "   Nama Gerbong   : " + this.namaGerbong + "\n";
        info += "======================================= \n";
        
        if (!riwayatTransaksi.isEmpty()) {
            info += "          Riwayat Transaksi \n";
            info += "        ---------------------\n";
            
            for (Transaksi transaksi : riwayatTransaksi) {
                info += transaksi.getInfo();
            }
        } else {
            info += "     *** Tidak Ada Transaksi ***";
        }
        
        info += "\n";
        
        return info;
    }
}
