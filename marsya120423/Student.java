/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package marsya120423;

/**
 * 
 * @author Marsya Missendhi
 */
public class Student extends Person {
    public static void main( String[] args ){ 
        Student student = new Student(); 
        student.name = "Ali";
        student.address = "Padang";
    }
    
    @Override
    public String getName(){
        System.out.println("getName Student");
        return name; 
    } 
    
    public Student(){ 
        super ("Budi", "Padang"); //memanggil super class
        System.out.println("Inside Student : Constructor"); 
    }
}
