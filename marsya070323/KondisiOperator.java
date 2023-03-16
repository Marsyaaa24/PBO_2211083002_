/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package marsya070323;

/**
 *
 * @author Marsya Missendhi
 */
public class KondisiOperator {
    public static void main(String[] args){
    
        String status = "";
        int grade = 80;
        
        //mendapatkan status pelajar
        status = (grade >= 60)?"passed":"fail";
        
        //print status
        System.out.println( status );
    }
    
}
