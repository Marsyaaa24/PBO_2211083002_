/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UtsB.model;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Marsya Missendhi
 */
public class PesananDaoImpl implements PesananDao{
    List<Pesanan> data = new ArrayList<>();
    public PesananDaoImpl(){
        data.add(new Pesanan("111","Ali","01-01-2022","20000","5000","0"));
        data.add(new Pesanan("112","Deni","02-01-2022","30000","6000","0"));
        data.add(new Pesanan("113","Ani","03-01-2022","40000","8000","0"));
    }
    public void save(Pesanan pesanan){
        data.add(pesanan);
    }
    public void update(int index,Pesanan pesanan){
        data.set(index, pesanan);
    }
    public void delete(int index){
        data.remove(index);
    }
    public Pesanan getPesanan(int index){
        return data.get(index);
    }
    public List<Pesanan> getAll(){
        return data;
    }
}


