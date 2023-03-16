/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package marsya080323;

/**
 *
 * @author Marsya Missendhi
 */
public class latihan3 {
    public static void main(String[] args){
    
        int n1 = 10;
        int n2 = 23;
        int n3 = 5;
        int nb;
        
        nb = (n1>n2) ?n1: (n2>n3) ?n2: (n3>n1) ?n3:n1;
        
        System.out.println("number 1 = "+n1);
        System.out.println("number 2 = "+n2);
        System.out.println("number 3 = "+n3);
        System.out.println("nilai terbesar = "+nb);
    }
}
