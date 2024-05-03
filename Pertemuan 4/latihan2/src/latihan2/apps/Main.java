/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan2.apps;
import latihan2.manusia.Manusia;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner inputData = new Scanner(System.in);
        Manusia manusia = new Manusia();
        
        System.out.print("Masukan Tahun Lahir Anda: ");
        manusia.setTahunLahir(inputData.nextInt());
        
        int tahunLahir = manusia.getTahunLahir();
        int umur = manusia.getUmur();
        String tanda = manusia.getTanda();
        manusia.umur(tahunLahir, umur, tanda);
    }
    
}
