/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UtsB.controller;
import UtsB.view.FormPesanan;
import UtsB.model.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Marsya Missendhi
 */
public class PesananController {
    private FormPesanan formPesanan;
    private PesananDao pesananDao;
    private Pesanan pesanan;
    
    public PesananController(FormPesanan formPesanan){
        this.formPesanan = formPesanan;
        pesananDao = new PesananDaoImpl();
    }
    
    public void bersihForm(){
        formPesanan.getTxtKode().setText("");
        formPesanan.getTxtNama().setText("");
        formPesanan.getTxtTanggal().setText("");
        formPesanan.getTxtHarga().setText("");
        formPesanan.getTxtOngkos().setText("");
        formPesanan.getTxtDiskon().setText("");
    }
    
    public void savePesanan(){
        pesanan = new Pesanan();
        pesanan.setKode(formPesanan.getTxtKode().getText());
        pesanan.setNama(formPesanan.getTxtNama().getText());
        pesanan.setTanggal(formPesanan.getTxtTanggal().getText());
        pesanan.setHarga(formPesanan.getTxtHarga().getText());
        pesanan.setOngkos(formPesanan.getTxtOngkos().getText());
        pesanan.setDiskon(formPesanan.getTxtDiskon().getText());
        pesananDao.save(pesanan);
        javax.swing.JOptionPane.showMessageDialog(formPesanan, "Entri Ok");
    }
    
    public void getPesanan(){
        int index = formPesanan.getTblPesanan().getSelectedRow();
        pesanan = pesananDao.getPesanan(index);
        if(pesanan != null){
            formPesanan.getTxtKode().setText(pesanan.getKode());
            formPesanan.getTxtNama().setText(pesanan.getNama());
            formPesanan.getTxtTanggal().setText(pesanan.getTanggal());
            formPesanan.getTxtHarga().setText(pesanan.getHarga());
            formPesanan.getTxtOngkos().setText(pesanan.getOngkos());
            formPesanan.getTxtDiskon().setText(pesanan.getDiskon());
        }
    }
    
    public void updatePesanan(){
        int index = formPesanan.getTblPesanan().getSelectedRow();
        pesanan.setKode(formPesanan.getTxtKode().getText());
        pesanan.setNama(formPesanan.getTxtNama().getText());
        pesanan.setTanggal(formPesanan.getTxtTanggal().getText());
        pesanan.setHarga(formPesanan.getTxtHarga().getText());
        pesanan.setOngkos(formPesanan.getTxtOngkos().getText());
        pesanan.setDiskon(formPesanan.getTxtDiskon().getText());
        pesananDao.update(index,pesanan);
    }
    
    public void deletePesanan(){
        int index = formPesanan.getTblPesanan().getSelectedRow();
        pesananDao.delete(index);
        javax.swing.JOptionPane.showMessageDialog(formPesanan, "Delete");
    }
    
    public void tampilData(){
        DefaultTableModel tabelModel =
                (DefaultTableModel) formPesanan.getTblPesanan().getModel();
        tabelModel.setRowCount(0);
        java.util.List<Pesanan> list = pesananDao.getAll();
        for(Pesanan pesanan : list){
            Object[] data = {
                pesanan.getKode(),
                pesanan.getNama(),
                pesanan.getTanggal(),
                pesanan.getHarga(),
                pesanan.getOngkos(),
                pesanan.getDiskon()
            };
            tabelModel.addRow(data);
        }
    }
}

