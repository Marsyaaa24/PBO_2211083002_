/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package marsya060423;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Marsya Missendhi
 */
public class BukuAlamatExample {
    public static void main(String[] args) throws IOException {
        BukuAlamat data[] = new BukuAlamat[100];
        BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in) ); 
        int pil=0;
        int index =0;
        while(pil != 5){
            System.out.println("1.Masukkan data");
            System.out.println("2.Hapus data");
            System.out.println("3.Edit data");
            System.out.println("4.Tampilkan semua data");
            System.out.println("5.Exit");
            pil =Integer.parseInt(dataIn.readLine());
            switch(pil){
                case 1:
                    BukuAlamat temp = new BukuAlamat();
                    System.out.print("NAMA             :");
                    temp.setNama(dataIn.readLine());
                    System.out.print("ALAMAT           :");
                    temp.setAlamat(dataIn.readLine());
                     System.out.print("NOMOR TELPON     :");
                    temp.setNomortelpon=Integer.parseInt(dataIn.readLine());
                     System.out.print("EMAIL            :");
                    temp.setEmail(dataIn.readLine());
                    data[index] = temp;
                    index++;
                    break;
                case 2:
                        break;
                case 3:
                        break;
                case 4:
                        break;
                case 5:
                        break;
                    
            }
            
            

        }
    }
}
