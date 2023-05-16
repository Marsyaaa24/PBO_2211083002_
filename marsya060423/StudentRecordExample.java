/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package marsya060423;

/**
 *
 * @author Marsya Missendhi
 */
public class StudentRecordExample {
     public static void main (String[] args) {
        StudentRecord marsyaRecord = new StudentRecord(); 
        StudentRecord aryaRecord = new StudentRecord(); 
        StudentRecord aliRecord = new StudentRecord(); 
        
        //mengisi data marsya
        marsyaRecord.setName("Marsya"); 
        marsyaRecord.setAddress("Padang");
        marsyaRecord.setAge(20);
        
        //mengisi data arya
        aryaRecord.setName("Arya"); 
        aryaRecord.setAddress("Ciamis");
        aryaRecord.setAge(10);
        
        //mengisi data ali
        aliRecord.setName("Ali"); 
        aliRecord.setAddress("Kalimantan");
        aliRecord.setAge(70);
        
        //menampilkan data marsya
        System.out.println("Nama : " +marsyaRecord.getName());
        System.out.println("Alamat : " +marsyaRecord.getAddress());
        System.out.println("Umur : " +marsyaRecord.getAge());
        
        //menampilkan data arya
        System.out.println("\t");
        System.out.println("Nama : " +aryaRecord.getName());
        System.out.println("Alamat : " +aryaRecord.getAddress());
        System.out.println("Umur : " +aryaRecord.getAge());
        
        //menampilkan data dan nilai ali
        System.out.println("\t");
        aliRecord.print("");
        aliRecord.print(60,70,80);
         
        //Menampilkan jumlah siswa 
        System.out.println("Count : "+StudentRecord.getStudentCount()); 
    
    }
}
