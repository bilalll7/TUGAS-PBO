/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan4.nilai;

/**
 *
 * @author ASUS
 */
public class Nilai {
    // Properties
    private int nilaiPraktikum,
                nilaiTugas,
                nilaiUTS,
                nilaiUAS;
    private double nilaiAkhir;
    private char indeks;
    // Constructor
    public Nilai(){
        
    }
    // Setter & Getter

    public int getNilaiPraktikum() {
        return nilaiPraktikum;
    }

    public void setNilaiPraktikum(int nilaiPraktikum) {
        this.nilaiPraktikum = nilaiPraktikum;
    }

    public int getNilaiTugas() {
        return nilaiTugas;
    }

    public void setNilaiTugas(int nilaiTugas) {
        this.nilaiTugas = nilaiTugas;
    }

    public int getNilaiUTS() {
        return nilaiUTS;
    }

    public void setNilaiUTS(int nilaiUTS) {
        this.nilaiUTS = nilaiUTS;
    }

    public int getNilaiUAS() {
        return nilaiUAS;
    }

    public void setNilaiUAS(int nilaiUAS) {
        this.nilaiUAS = nilaiUAS;
    }

    public double getNilaiAkhir() {
        return nilaiAkhir;
    }

    public void setNilaiAkhir(double nilaiAkhir) {
        this.nilaiAkhir = nilaiAkhir;
    }

    public char getIndeks() {
        return indeks;
    }

    public void setIndeks(char indeks) {
        this.indeks = indeks;
    }
    
    
    
    //Method
    public void displayNilai(int nilaiPraktikum, int nilaiTugas, int nilaiUTS, int nilaiUAS, double nilaiAkhir, char indeks){
        
        System.out.println("Nilai Praktikum   : " + nilaiPraktikum);
        System.out.println("Nilai Tugas       : " + nilaiTugas);
        System.out.println("Nilai UTS         : " + nilaiUTS);
        System.out.println("Nilai UAS         : " + nilaiUAS);
        
        nilaiAkhir = (nilaiPraktikum + nilaiTugas + nilaiUTS + nilaiUAS) / 4;
        setNilaiAkhir(nilaiAkhir);
        System.out.println("Nilai Akhir       : " + nilaiAkhir);
        if(nilaiAkhir >= 88 && nilaiAkhir <= 100){
            indeks = 'A';
        }else if(nilaiAkhir >= 70 && nilaiAkhir < 88){
            indeks = 'B';
        }else if(nilaiAkhir >= 55 && nilaiAkhir < 70){
            indeks = 'C';
        }else if(nilaiAkhir >= 35 && nilaiAkhir < 55){
            indeks = 'D';
        }else if(nilaiAkhir >= 0 && nilaiAkhir < 35){
            indeks = 'E';            
        }
        setIndeks(indeks);
        System.out.println("Indeks            : " + indeks);
        
    }
}
