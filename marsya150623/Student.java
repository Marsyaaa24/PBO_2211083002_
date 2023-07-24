/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package marsya150623;

/**
 *
 * @author Marsya Missendhi
 */
public class Student extends Person {
    public Student(){ 
        super( "Marsya", "Padang");
        System.out.println("Inside Student: Constructor");  
        } 
    
    
    public String getName(){
        System.out.println("Parent: getName");
        return name;
    }
    
    public static void main( String[] args ){ 
        Student anna = new Student(); 
        anna.name = "Missendhi";
        anna.address = "Padang";
        System.out.println("Nama    "+anna.name);
    } 
}
