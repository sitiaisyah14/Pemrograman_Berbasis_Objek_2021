/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

/**
 *
 * @author WINDOWS 10
 */
import java.util.ArrayList;
import java.sql.*;
import java.util.Date;

public class Peminjaman {

    private int idpeminjaman;
    private Anggota anggota = new Anggota();
    private Buku buku = new Buku();
    private Date tanggalpinjam = new Date();
    private Date tanggalkembali = new Date();

    public Peminjaman() {

    }

    public Peminjaman(Anggota anggota, Buku buku, Date tanggalpinjam, Date tanggalkembali) {
        this.anggota = anggota;
        this.buku = buku;
        this.tanggalpinjam = tanggalpinjam;
        this.tanggalkembali = tanggalkembali;
    }

    public Peminjaman getById(int id) {
        Peminjaman pj = new Peminjaman();
        ResultSet rs = DBHelper.selectQuery("SELECT "
                + " p.idpeminjaman AS idpeminjaman,"
                + " a.idanggota AS idanggota,"
                + " b.idbuku AS idbuku,"
                + " p.tanggalpinjam AS tanggalpinjam,"
                + " p.tanggalkembali AS tanggalkembali,"
                + " FROM buku b "
                + " LEFT JOIN peminjaman p ON b.idbuku = p.idbuku"
                + " LEFT JOIN anggota a ON a.idanggota = p.idanggota"
                + " WHERE p.idpeminjaman = '" + id + "'");
        try {
            while (rs.next()) {
                buku = new Buku();
                buku.setIdbuku(rs.getInt("idbuku"));
                buku.getKategori().setIdkategori(rs.getInt("idkategori"));
                buku.getKategori().setNama(rs.getString("nama"));
                buku.getKategori().setKeterangan(rs.getString("keterangan"));
                buku.setJudul(rs.getString("judul"));
                buku.setPenerbit(rs.getString("penerbit"));
                buku.setPenulis(rs.getString("penulis"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return buku;
    }

}
