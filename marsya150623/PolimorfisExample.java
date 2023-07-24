/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package marsya150623;

/**
 *
 * @author Marsya Missendhi
 */
public class PolimorfisExample {
    public static void main(String[] args){
        Person ref;
        
        Student student = new Student();
        Employee employee = new Employee();
        
        student.setName("Alif");
        ref = student;
        System.out.println("Nama    "+ref.getName());
        employee.setName("Beni");
        ref = employee;
        System.out.println("Nama    "+ref.getName());
    }
            
}
