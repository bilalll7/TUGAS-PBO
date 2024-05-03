/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan3.apps;
import latihan3.bangunruang.BangunRuang;
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
        BangunRuang bangunruang = new BangunRuang();
        
        bangunruang.header();
        
        System.out.print("PILIH BANGUN RUANG [1/2/3]  : ");
        bangunruang.setPilihan(inputData.nextInt());
        bangunruang.hitungVolume();
    }
    
}
