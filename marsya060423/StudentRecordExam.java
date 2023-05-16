/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package marsya060423;

/**
 *
 * @author Marsya Missendhi
 */
public class StudentRecordExam {
    public static void main(String [] args){
        StudentRecord marsya = new StudentRecord("Marsya","Padang");
        marsya.nilai=0;
        marsya.print("");
        
        
        System.out.println("Jumlah Record : "+StudentRecord.getStudentCount());
    }
}
