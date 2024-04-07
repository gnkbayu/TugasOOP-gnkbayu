/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugasbayu;
import javax.swing.JOptionPane;
/**
 *
 * @author T44o
 */
public class TugasBayu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String inputAlas = JOptionPane.showInputDialog("Masukkan alas segitiga: ");
        double alas = Double.parseDouble(inputAlas);
        
        String inputTinggi = JOptionPane.showInputDialog("Masukkan tinggi segitiga: ");
        double tinggi = Double.parseDouble(inputTinggi);
        
        double luas = (alas * tinggi) / 2;
        
        JOptionPane.showMessageDialog(null, "Luas segitiga adalah: " + luas);
    }
    
}
