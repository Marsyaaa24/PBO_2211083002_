/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package marsya150323;
import javax.swing.JOptionPane;
/**
 *
 * @author Marsya Missendhi
 */
public class LatihanNilai2 {
    public static void main( String[] args ){
        int a = 0, b = 0, c = 0;
        int avg;
        
        a = Integer.parseInt (JOptionPane.showInputDialog("Nilai 1 :"));
        b = Integer.parseInt (JOptionPane.showInputDialog("Nilai 2 :"));
        c = Integer.parseInt (JOptionPane.showInputDialog("Nilai 3 :"));
        
        avg = (a+b+c)/3;
        
        String msg = "rata-rata : "+avg;
        JOptionPane.showMessageDialog(null, msg);
        
        if(avg >= 60){
            String smiley = "Selamat yaaaaa :D";
         JOptionPane.showMessageDialog(null, smiley);  
        }
        else {
            String nsmiley = "Jangan putus asa yaaa T_T";
         JOptionPane.showMessageDialog(null, nsmiley);
        }
    }
}
