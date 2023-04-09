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
public class Transaksi {
    private LocalDate tanggal;
    private String noTrans;
    private Penumpang penumpang;
    
    public LocalDate getTanggal(){
        return tanggal;
    }
    
    public void setTanggal(LocalDate tanggal){
        this.tanggal = tanggal;
    }
    
    public String getNoTrans(){
        return noTrans;
    }
    
    public void setNoTrans(String noTrans){
        this.noTrans = noTrans;
    }
    
    public Penumpang getPenumpang(){
        return penumpang;
    }
    
    public void setPenumpang(Penumpang penumpang){
        this.penumpang = penumpang;
    }
    
    public String getInfo(){
        String info = "";
        info += "\nTanggal       : " + tanggal;
        info += "\nNo Trans      : " + noTrans;
        info += "\n" + penumpang.getInfo();
        info += "\n";
        
        return info;
    }
}
