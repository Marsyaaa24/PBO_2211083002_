/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package marsya240523.controller;

import java.sql.Connection;
import marsya240523.dao.*;
import marsya240523.model.*;
import marsya240523.database.DatabaseHelper;
import marsya240523.view.*;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Marsya Missendhi
 */
public class PengembalianController {
    FormPengembalian formPengembalian;
    PengembalianDao pengembalianDao;
    PeminjamanDao peminjamanDao;
    AnggotaDao anggotaDao;
    BukuDao bukuDao;
    Connection connection;
    Pengembalian pengembalian;
    private FormPengembalian FormPengembalian;

    public PengembalianController(FormPengembalian formPengembalian){
        try{
            this.FormPengembalian = formPengembalian;
            connection = DatabaseHelper.getConnection();
            pengembalianDao = new PengembalianDaoImpl(connection);
            peminjamanDao = new PeminjamanDaoImpl(connection);
            anggotaDao = new AnggotaDaoImpl(connection);
            bukuDao = new BukuDaoImpl(connection);
        }
        catch (SQLException ex){
           JOptionPane.showMessageDialog(formPengembalian, "Opps : "+ex);
        } 
    }
    
    
    public void clearForm(){
        formPengembalian.getTxtDenda().setText("");
        formPengembalian.getTxtTerlambat().setText("");
        formPengembalian.getTxtTglkembali().setText("");
        formPengembalian.getTxtTglpinjam().setText("");
       
    }
    
    public void isiCboAnggota(){
        try {
            formPengembalian.getCboNobp().removeAllItems();
            List<Anggota> list = anggotaDao.getAll();
            for (Anggota anggota : list) {
                formPengembalian.getCboNobp().addItem(anggota.getNobp()+"-"+anggota.getNama());
            }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(formPengembalian, "Opps : "+ex);
        }
    }
    
    public void isiCboBuku(){
        try {
            formPengembalian.getCboKodebuku().removeAllItems();
            List<Buku> list = bukuDao.getAll();
            for (Buku buku : list) {
                formPengembalian.getCboKodebuku().addItem(buku.getKodeBuku()+"-"+buku.getJudulbuku());
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(formPengembalian, "Opps : "+ex);
        }
    }
    
    public void loadCmbBox(){
       try {
            formPengembalian.getCboNobp().removeAllItems();
            formPengembalian.getCboKodebuku().removeAllItems();
            List<Anggota> list = anggotaDao.getAll();
            for (Anggota anggota : list) {
                formPengembalian.getCboNobp().addItem(anggota.getNobp() + " - " + anggota.getNama());
            }
            List<Buku> listbuku = bukuDao.getAll();
            for (Buku buku : listbuku ){
                formPengembalian.getCboKodebuku().addItem(buku.getKodeBuku() + " - " + buku.getJudulBuku());
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(formPengembalian, "Opps : "+ex);
        }
       
    }
    
    public void insert(){
        try {
            pengembalian = new Pengembalian();
            pengembalian.setNobp(formPengembalian.getCboNobp().getSelectedItem().toString().split(" - ")[0]);
            pengembalian.setKodebuku(formPengembalian.getCboKodebuku().getSelectedItem().toString().split(" - ")[0]);
            pengembalian.setTglpinjam(formPengembalian.getTxtTglpinjam().getText());
            pengembalian.setTglkembali(formPengembalian.getTxtTglkembali().getText());
            pengembalian.setTerlambat(Integer.parseInt(formPengembalian.getTxtTerlambat().getText()));
            pengembalian.setDenda(Double.parseDouble(formPengembalian.getTxtTerlambat().getText()));
            pengembalianDao.insert(pengembalian);
            JOptionPane.showMessageDialog(formPengembalian, "Pengembalian Ok");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(formPengembalian, "Opps : "+ex);
        }
    }
    
    public void getPengembalian() throws Exception {
        try {
            pengembalian = new Pengembalian();
            String nobp = formPengembalian.getTblPengembalian()
                    .getValueAt(formPengembalian.getTblPengembalian().getSelectedRow(), 0).toString();
            String kodebuku = formPengembalian.getTblPengembalian()
                    .getValueAt(formPengembalian.getTblPengembalian().getSelectedRow(), 2).toString();
            String tglPinjam = formPengembalian.getTblPengembalian()
                    .getValueAt(formPengembalian.getTblPengembalian().getSelectedRow(), 4).toString();
            
            Peminjaman peminjaman = peminjamanDao.getPeminjaman(nobp, kodebuku, tglPinjam);
            Anggota anggota = anggotaDao.getAnggota(peminjaman.getAnggota().getNobp());
            formPengembalian.getCboNobp().setSelectedItem(anggota.getNobp()+"-"+anggota.getNama());
            Buku buku = bukuDao.getBuku(peminjaman.getBuku().getKodeBuku);
            formPengembalian.getCboKodebuku().setSelectedItem(buku.getKodeBuku()+"-"+buku.getJudulbuku());
            formPengembalian.getTxtTglpinjam().setText(peminjaman.getTglPinjam());
            formPengembalian.getTxtTglkembali().setText(pengembalian.getTglkembali());
            int terlambat = pengembalianDao.selisihTanggal(pengembalian.getTglkembali(), peminjaman.getTglKembali());
            pengembalian.setTerlambat(terlambat);
            formPengembalian.getTxtTerlambat().setText(""+terlambat);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(formPengembalian, "Opps : "+ex);
        }
    }
    
    public void tampil() throws SQLException{
        try {
            DefaultTableModel tabelModel = (DefaultTableModel) formPengembalian.getTblPengembalian().getModel();
            tabelModel.setRowCount(0);
            List<Pengembalian> list = pengembalianDao.getAll();
            for (Pengembalian p : list) {
                Anggota anggota = anggotaDao.getAnggota(p.getNobp());
                Buku buku = bukuDao.getBuku(p.getKodebuku());
                Peminjaman peminjaman = peminjamanDao.getPeminjaman(p.getNobp(), p.getKodebuku(), p.getTglpinjam());
                Object[] row = {
                    anggota.getNobp(),
                    anggota.getNama(),
                    buku.getKodeBuku(),
                    buku.getJudulBuku(),
                    p.getTglpinjam(),
                    peminjaman.getTglKembali(),
                    p.getTglkembali(),
                    p.getTerlambat(),
                    p.getDenda()
                };
                tabelModel.addRow(row);
                
            }
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(formPengembalian, "Opps : "+ex);
        }
       
        
    }
    
   
}