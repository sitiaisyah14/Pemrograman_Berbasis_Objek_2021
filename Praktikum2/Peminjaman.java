/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

/**
 *
 * @author WINDOWS 10
 */
public class Peminjaman {
    public int lamaSewa;
    public Member member;
    public Game game;
    
    public int totalBayar(){
        int total = lamaSewa * game.hargaGame;
        return total;
    }
            
    public void cetakInfoPegawai(){
        System.out.println("Id          : " + member.id);
        System.out.println("Nama        : " + member.nama);
        System.out.println("Nama Game   : " + game.namaGame);
        System.out.println("Harga Game  : Rp. " + game.hargaGame + "/jam");
        System.out.println("Lama Sewa   : " + lamaSewa + " jam");
        System.out.println("Total Bayar : Rp. " + totalBayar());
    } 
}
