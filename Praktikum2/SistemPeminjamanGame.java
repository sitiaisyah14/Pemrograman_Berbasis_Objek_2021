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
public class SistemPeminjamanGame {
    public static void main(String[] args) {
        //Data 1
        Game game1 = new Game();
        game1.namaGame = "Minecraft";
        game1.hargaGame = 20000;
        
        Member m1 = new Member();
        m1.id = 111;
        m1.nama = "Aisyah";
        
        Peminjaman trs1 = new Peminjaman();
        trs1.game = game1;
        trs1.member = m1;
        trs1.lamaSewa = 3;
        
        System.out.println("===============================");
        trs1.cetakInfoPegawai();
        System.out.println("===============================");
        
        //Data 2
        Game game2 = new Game();
        game2.namaGame = "Home Design Story";
        game2.hargaGame = 30000;
        
        Member m2 = new Member();
        m2.id = 122;
        m2.nama = "Aprilia";
        
        Peminjaman trs2 = new Peminjaman();
        trs2.game = game2;
        trs2.member = m2;
        trs2.lamaSewa = 5;
        
        System.out.println("===============================");
        trs2.cetakInfoPegawai();
        System.out.println("===============================");
    }
}
