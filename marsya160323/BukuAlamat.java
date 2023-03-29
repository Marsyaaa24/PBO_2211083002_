/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package marsya160323;

/**
 *
 * @author Marsya Missendhi
 */
public class BukuAlamat {
    public static void main(String[] args){
        String[][] entry = {
            {"Marsya", "24032003", "Ciamis"}, 
            {"Desya", "15072003", "Bogor"}, 
            {"Udin", "321399", "Papua"}};

        for (int i = 0; i < entry.length; i++) {
            System.out.println("Nama : " + entry[i][0]);
            System.out.println("Tel. # : " + entry[i][1]);
            System.out.println("Alamat : " + entry[i][2] + "\n");
        }

    }
}
