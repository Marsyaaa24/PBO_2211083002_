/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package marsya240523.dao;

import java.sql.Connection;
import marsya240523.model.Pengembalian;
import java.sql.SQLException;
import java.sql.*;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author Marsya Missendhi
 */
public class PengembalianDaoImpl implements PengembalianDao {
    
     Connection connection;
    public PengembalianDaoImpl(Connection connection){
        this.connection = connection;
    
    }
    
    public void insert(Pengembalian pengembalian) throws SQLException {
        String sql="Insert into Pengembalian values (?,?,?,?,?,?)";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, pengembalian.getNobp());
        ps.setString(2, pengembalian.getKodebuku());
        ps.setString(3, pengembalian.getTglpinjam());
        ps.setString(4, pengembalian.getTglkembali());
        ps.setInt(5, pengembalian.getTerlambat());
        ps.setDouble(6, pengembalian.getDenda());
        ps.executeUpdate();
        
    }
    
    public void update(Pengembalian pengembalian) throws SQLException {
        String sql="update Pengembalian set tglkembali=?, terlambat=?, denda=? " + 
                "where nobp=? and kodebuku=? and tglpinjam=?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, pengembalian.getTglkembali());
        ps.setInt(2, pengembalian.getTerlambat());
        ps.setDouble(3, pengembalian.getTerlambat());
        ps.setString(4, pengembalian.getNobp());
        ps.setString(5, pengembalian.getKodebuku());
        ps.setString(6, pengembalian.getTglpinjam());
        ps.executeUpdate();
    }
    
    public void delete(String nobp) throws SQLException{
        String sql="delete from Pengembalian where nobp=?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, nobp);
        ps.executeUpdate();
    }
    
    public Pengembalian getPengembalian(String nobp) throws SQLException {
        String sql="select * from Pengembalian where nobp=?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, nobp);
        ResultSet rs = ps.executeQuery();
        Pengembalian pengembalian = null;
        if(rs.next()){
            pengembalian = new Pengembalian();
            pengembalian.setNobp(rs.getString(1));
            pengembalian.setKodebuku(rs.getString(2));
            pengembalian.setTglpinjam(rs.getString(3));
            pengembalian.setTglkembali(rs.getString(4));
            pengembalian.setTerlambat(rs.getInt(5));
            pengembalian.setDenda(rs.getDouble(6));
        }
        return pengembalian;
    }
    public List<Pengembalian>getAll() throws SQLException{
        String sql="SELECT `anggota`.`nobp', 'anggota'.'nama', buku.'kodebuku', buku.'judulbuku',\n" +
        "`peminjaman`.`tglpinjam`, `peminjaman`.`tglkembali`, `pengembalian`.`tgldikembalikan`, \n" +
        "`pengembalian`.`terlambat`,`pengembalian`.`denda` \n" +
        "FROM `peminjaman` INNER JOIN `anggota` ON `peminjaman`.`nobp` = `anggota`.`nobp`\n" +
        "INNER JOIN `buku` ON `peminjaman`.`kodebuku` = buku.`kodebuku`\n" +
        "LEFT JOIN `pengembalian` ON (`peminjaman`.`nobp` = `pengembalian`.`nobp`\n" +
        "AND `peminjaman`.`kodebuku`=`pengembalian`.`kodebuku`\n" +
        "AND `peminjaman`.`tglpinjam`=`pengembalian`.`tglpinjam`)";
        PreparedStatement ps = connection.prepareStatement(sql);
        Pengembalian pengembalian = null;
        ResultSet rs = ps.executeQuery();
        List<Pengembalian> pengembalianList = new ArrayList<>();
        while(rs.next()){
            pengembalian = new Pengembalian();
            pengembalian.setNobp(rs.getString("nobp"));
            pengembalian.setKodebuku(rs.getString("kodebuku"));
            pengembalian.setTglpinjam(rs.getString("tglpinjam"));
            pengembalian.setTglkembali(rs.getString("tglkembali"));
            pengembalian.setTerlambat(rs.getInt("terlambat"));
            pengembalian.setDenda(rs.getDouble("denda"));
            pengembalianList.add(pengembalian);
        }
        return pengembalianList;
    }
    
    public int selisihTanggal(String tgl1, String tgl2) throws Exception {
        int selisih=0;
        String sql = "SELECT DATEDIFF(?, ?) AS selisih";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, tgl1);
        ps.setString(2, tgl2);
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            selisih = rs.getInt(1);
        }
        return selisih;
    }

    public Pengembalian getPeminjaman(String nobp, String kodebuku, String tglpinjam) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); 
        // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Pengembalian getpengembalian(String nobp, String kodebuku, String tglpinjam) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); 
        // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
}
