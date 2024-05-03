/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan3.bangunruang;
import java.util.Scanner;


/**
 *
 * @author ASUS
 */
public class BangunRuang {
    // Create Properties
    private int pilihan;
    private int panjang;
    private int lebar;
    private int tinggi;
    private final double PHI = 3.14;
    private int r;
    
    // Create Constructor
    public BangunRuang(){
        
    }
    
    //Scanner
    Scanner inputNilai = new Scanner(System.in);

    // Setter & Getter
    public int getPilihan() {
        return pilihan;
    }

    public void setPilihan(int pilihan) {
        this.pilihan = pilihan;
    }
    
    
    // Method
    public void header(){
        System.out.println("Program Menghitung VOLUME Bangun Ruang");
        System.out.println("======================================");
        System.out.println("1) Volume Balok");
        System.out.println("2) Volume Tabung");
        System.out.println("3) Volume Bola");
        System.out.println("");
    }
    
    public void hitungVolume(){
        if(getPilihan() == 1){
            balok();
        }else if(getPilihan() == 2){
            tabung();
        }else if(getPilihan() == 3){
            bola();
        }else{
            System.out.println("Masukan Pilihan Sesuai dengan ketentuan diatas!");
        }
    }
    public void balok(){
        System.out.println("MENU BALOK");
        System.out.println("Masukan Nilai Panjang, Lebar, & Tinggi");
        System.out.println("======================================");
        System.out.print("Panjang       : ");
        int panjang = inputNilai.nextInt();
        System.out.print("Lebar         : ");
        int lebar = inputNilai.nextInt();
        System.out.print("Tinggi        : ");
        int tinggi = inputNilai.nextInt();
        double volume = panjang * lebar * tinggi;
        System.out.println("Tampil Volume Tabung = " + volume);       
    }
    public void tabung(){
        System.out.println("MENU TABUNG");
        System.out.println("Masukan Nilai Jari - Jari & Tinggi");
        System.out.println("======================================");
        System.out.print("Jari - Jari       : ");  
        int r = inputNilai.nextInt();
        System.out.print("Tinggi            : ");  
        int tinggi = inputNilai.nextInt();  
        double volume = this.PHI * r * r * tinggi;
        System.out.println("Tampil Volume Tabung = " + volume);
    }
    public void bola(){
        System.out.println("MENU BOLA");
        System.out.println("Masukan Nilai Jari - Jari");
        System.out.println("======================================"); 
        System.out.print("Jari - Jari       : ");  
        int r = inputNilai.nextInt();
        double volume =  (4.0 / 3.0)  * this.PHI * r * r * r;
        System.out.println("Tampil Volume Bola = " + volume);
    }
}
