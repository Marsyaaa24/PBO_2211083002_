/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package marsya240523.dao;
import marsya240523.model.Buku;
import java.sql.SQLException;
import java.util.List;
/**
 *
 * @author Marsya Missendhi
 */
public interface BukuDao {
    void insert (Buku buku) throws SQLException;
    void update(Buku buku)throws SQLException;
    void delete(String kodeBuku)throws SQLException;
    Buku getBuku(String kodeBuku)throws SQLException;
    List<Buku> getAll()throws SQLException;
}
