/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package marsya060423;

/**
 *
 * @author Marsya Missendhi
 */
public class BukuAlamat {
    private String nama;
    private String alamat;
    private int nomortelpon;
    private String email;
    int setNomortelpon;
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama =nama;
    }
    public String getAlamat(){
        return alamat;
    }
    public void setAlamat(String alamat){
        this.alamat =alamat;
    }
    public int getNomortelpon(){
        return nomortelpon;
    }
    public void setNomortelpon(int nomortelpon){
        this.nomortelpon =nomortelpon;
    }
    public void setEmail(String email){
        this.email =email;
    }
    public String getEmail(){
        return email;
    }
}
