/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package marsya160323;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author Marsya Missendhi
 */
public class LatihanNomorTerbesarBufferedReader {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[10];
        int maxNumber = 0;

        System.out.println("Masukkan 10 nomor:");

        try {
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = Integer.parseInt(reader.readLine());

                if (numbers[i] > maxNumber) {
                    maxNumber = numbers[i];
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Input terbesar yang diberikan oleh pengguna adalah: " + maxNumber);
    }
}

