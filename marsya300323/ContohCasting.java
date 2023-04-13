/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package marsya300323;

/**
 *
 * @author Marsya Missendhi
 */
public class ContohCasting {
    public static void main(String[] args) {
        char valChar = 'a'; 
        int valInt = valChar; 
        double valDouble = 10.12;//men-convert valDouble ke tipe int 
         
        double x = 50; 
        int y = 2; 
        int result = (int)(x/y); //hasil typecast operasi ke int 
        
        System.out.print(result);
    }
}


//dia akan merubah char menjadi kode askey
