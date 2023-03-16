/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package marsya150323;
import java.io.BufferedReader; 
import java.io.InputStreamReader; 
import java.io.IOException; 
/**
 *
 * @author Marsya Missendhi
 */
public class LatihanNilai {
     public static void main(String[] args){
         BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in) ); 
         int nilai1;
         int nilai2;
         int nilai3;
         int average;
                 
        try{ 
            System.out.print("Entri nilai 1 : "); 
            nilai1 = Integer.parseInt(dataIn.readLine());
            System.out.print("Entri nilai 2 : "); 
            nilai2 = Integer.parseInt(dataIn.readLine());
            System.out.print("Entri nilai 3 : "); 
            nilai3 = Integer.parseInt(dataIn.readLine());
             average = (nilai1 + nilai2 + nilai3)/3;
        System.out.println("average is "+ average);
        if( average >= 60 ){ 
         System.out.println("Congratulation :) "); 
         } 
        else { 
         System.out.println("Don't Give Up :( ");
        }
        }catch(IOException ex){
            System.out.println("Error");
        }
      
    }
}
