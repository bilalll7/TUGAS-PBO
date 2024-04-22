/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan4;

/**
 *
 * @author ASUS
 */
public class Latihan4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Deklarasikan Variable
        String namaMahasiswa;
        String kelas;
        int nilaiPraktikum;
        int nilaiTugas;
        int nilaiUts;
        int nilaiUas;
        double nilaiAkhir;
        char indeks;
        
        // Isi nilai variable
        namaMahasiswa = "Selamet Riyadi";
        kelas = "IF-6";
        nilaiPraktikum = 100;
        nilaiTugas = 80;
        nilaiUts = 75;
        nilaiUas = 85;
        
        // Operasi untuk menghitung nilai akhir
        nilaiAkhir = ((0.1 * nilaiPraktikum) + (0.2 * nilaiTugas) + (0.3 * nilaiUts) + (0.4 * nilaiUas));
        
        //Memetakan indeks nilai akhir berdasarkan nilai akhir menngunakan if statement
        if((nilaiAkhir >= 80) && (nilaiAkhir <= 100)){
            indeks = 'A';
        } else if((nilaiAkhir >= 65) && (nilaiAkhir < 80)){
            indeks = 'B';
        } else if((nilaiAkhir >= 45) && (nilaiAkhir < 65)){
            indeks = 'C';
        } else if((nilaiAkhir >= 30) && (nilaiAkhir < 45)){
            indeks = 'D';
        } else {
            indeks = 'E';
        }
        
        
        // Output
        System.out.println("Nama Mahasiswa\t: " + namaMahasiswa);
        System.out.println("Kelas\t\t: " + kelas);
        System.out.println("Nilai Praktikum : " + nilaiPraktikum);
        System.out.println("Nilai Tugas\t: " + nilaiTugas);
        System.out.println("Nilai UTS\t: " + nilaiUts);
        System.out.println("Nilai UAS\t: " + nilaiUas);
        System.out.println("Nilai Akhir\t: " + nilaiAkhir);
        
        
        System.out.println("----------------------------------------------------");
        // Percabangan
        // if statement
        if(nilaiAkhir >= 30){
            System.out.println(namaMahasiswa + " Dinyatakan LULUS Mata kuliah PBO");
        }else {
            System.out.println(namaMahasiswa + " Dinyatakan TIDAK LULUS Mata kuliah PBO");
        }
        System.out.println("Indeks Nilai\t: " + indeks);
        
        // Switch Statement
        switch(indeks){
            case 'A' : System.out.println("Anda Lulus dengan sangat memuaskan");
                break;
            case 'B' : System.out.println("Lulus dengan baik");
                break;
            case 'C' : System.out.println("Lulus dengan Cukup");
                break;
            case 'D' : System.out.println("Lulus dengan kurang memuaskan");
                break;
            default : System.out.println("Tidak Lulus !!!");
                break;
        }
    }
    
}
