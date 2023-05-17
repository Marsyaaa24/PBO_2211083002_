/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UtsB.model;

/**
 *
 * @author Marsya Missendhi
 */
public class Pesanan {
    private String Kode;
    private String Nama;
    private String Tanggal;
    private String Harga;
    private String Ongkos;
    private String Diskon;
    
    public Pesanan(){}
    
    public Pesanan(String Kode, String Nama, String Tanggal, String Harga, String Ongkos, String Diskon){
        this.Kode = Kode;
        this.Nama = Nama;
        this.Tanggal = Tanggal;
        this.Harga = Harga;
        this.Ongkos = Ongkos;
        this.Diskon = Diskon;
    }
    
    public void setKode(String Kode){
        this.Kode = Kode;
    }
    public void setNama(String Nama){
        this.Nama = Nama;
    }
    public void setTanggal(String Tanggal){
        this.Tanggal = Tanggal;
    }
    public void setHarga(String Harga){
        this.Harga = Harga;
    }
    public void setOngkos(String Ongkos){
        this.Ongkos = Ongkos;
    }
    public void setDiskon(String Diskon){
        this.Diskon = Diskon;
    }
    public String getKode(){
        return Kode;
    }
    public String getNama(){
        return Nama;
    }
    public String getTanggal(){
        return Tanggal;
    }
    public String getHarga(){
        return Harga;
    }
    public String getOngkos(){
        return Ongkos;
    }
    public String getDiskon(){
        return Diskon;
    }
}
