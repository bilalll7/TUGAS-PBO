/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan4.apps;
import latihan4.mahasiswa.Mahasiswa;
import latihan4.nilai.Nilai;
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
        Mahasiswa mahasiswa = new Mahasiswa("Teknik Informatika");
        Nilai nilai = new Nilai();
        
        System.out.print("Nama Mahasiswa    : ");
        mahasiswa.setNama(inputData.nextLine());
        
        System.out.print("NIM Mahasiswa     : ");
        mahasiswa.setNim(inputData.nextLine());
        
        System.out.print("Kelas Mahasiswa   : ");
        mahasiswa.setKelas(inputData.nextLine());
        
        System.out.print("Nilai Praktikum   : ");
        nilai.setNilaiPraktikum(inputData.nextInt());
        
        System.out.print("Nilai Tugas       : ");
        nilai.setNilaiTugas(inputData.nextInt()); 
        
        System.out.print("Nilai UTS         : ");
        nilai.setNilaiUTS(inputData.nextInt());
        
        System.out.print("Nilai UAS         : ");
        nilai.setNilaiUAS(inputData.nextInt());
        System.out.println("");
        
        String nama = mahasiswa.getNama();
        String nim = mahasiswa.getNim();
        String kelas = mahasiswa.getKelas();
        int nilaiPraktikum = nilai.getNilaiPraktikum();
        int nilaiTugas = nilai.getNilaiTugas();
        int nilaiUTS = nilai.getNilaiUTS();
        int nilaiUAS = nilai.getNilaiUAS();
        double nilaiAkhir = nilai.getNilaiAkhir();
        char indeks = nilai.getIndeks();
        
        
        mahasiswa.displayMahasiswa(nama, nim, kelas);
        nilai.displayNilai(nilaiPraktikum, nilaiTugas, nilaiUTS, nilaiUAS, nilaiAkhir, indeks);
    }
    
}
