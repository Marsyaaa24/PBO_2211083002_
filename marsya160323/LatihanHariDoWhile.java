/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package marsya160323;

/**
 *
 * @author Marsya Missendhi
 */
public class LatihanHariDoWhile {
    public static void main(String[] args) {
        String[] days = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"};
        int i = 0;

        do {
            System.out.println(days[i]);
            i++;
        } while (i < days.length);
    }
}


