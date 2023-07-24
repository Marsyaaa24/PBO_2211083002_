/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package marsya240523.model;


import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Marsya Missendhi
 */
public class Pengembalian {
    private String nobp;
    private String kodebuku;
    private String tglpinjam;
    private String tglkembali;
    private int terlambat;
    private double denda;
    
    public Pengembalian(){}
    
    public Pengembalian(String nobp, String kodebuku, String tglpinjam, String tglkembali, int terlambat, double denda){
        this.nobp = nobp;
        this.kodebuku = kodebuku;
        this.tglpinjam = tglpinjam;
        this.tglkembali = tglkembali;
        this.terlambat = terlambat;
        this.denda = denda;
        
    }
    
     public void setNobp(String nobp){
        this.nobp = nobp;
    }
    public void setKodebuku(String kodebuku){
        this.kodebuku = kodebuku;
    }
    public void setTglpinjam(String tglpinjam){
        this.tglpinjam = tglpinjam;
    }
    public void setTglkembali(String tglkembali){
        this.tglkembali = tglkembali;
    }
    public void setTerlambat(int terlambat){
        this.terlambat = terlambat;
    }
    public void setDenda(double denda){
        this.denda = denda;
    }
    
    public String getNobp(){
        return nobp;
    }
    public String getKodebuku(){
        return kodebuku;
    }
    public String getTglpinjam(){
        return tglpinjam;
    }
    public String getTglkembali(){
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        tglkembali = format.format(new Date());
        return tglkembali;
    }
    public int getTerlambat(){
        return terlambat;
    }
    public double getDenda(){
        denda = terlambat * 1000;
        return denda;
    }
}
