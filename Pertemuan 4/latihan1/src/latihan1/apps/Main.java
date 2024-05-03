/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan1.apps;
import latihan1.printer.Printer;
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
        
        // Buat Scanner, sebelum itu import kan dulu package scannernya
        Scanner inputData = new Scanner(System.in);
        // Buat Object
        Printer printer = new Printer();
        
        // Inputan Pertama
        System.out.print("Masukkan Nama Anda          : ");
        printer.setNama(inputData.nextLine());
        
        // Inputan Kedua
        System.out.print("Mau Cetak Nama Berapa kali? : ");
        printer.setJmlCetak(inputData.nextInt());

        
        // get value nama dan jumlah cetak dari method getNama dan getJmlCetak
        String nama = printer.getNama();
        int jmlCetak = printer.getJmlCetak();
        
        // Outputkan
        printer.cetak(nama);
        printer.cetak(nama, jmlCetak);

        

    }
    
}
