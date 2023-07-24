/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package marsya240523.dao;

import marsya240523.model.Pengembalian;
import java.sql.SQLException;
import java.util.List;
/**
 *
 * @author Marsya Missendhi
 */
public interface PengembalianDao {
     void insert(Pengembalian pengembalian) throws SQLException;
    void update(Pengembalian pengembalian)throws SQLException;
    void delete(String nobp) throws SQLException;
    Pengembalian getpengembalian(String nobp, String kodebuku, String tglpinjam) throws SQLException;
    
    List<Pengembalian>getAll()throws SQLException;
    
    int selisihTanggal(String tgl1, String tgl2) throws Exception;
}
