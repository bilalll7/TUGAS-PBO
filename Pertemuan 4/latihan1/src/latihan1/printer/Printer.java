/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan1.printer;


/**
 *
 * @author ASUS
 */
public class Printer {
    // Buat Properties dengan access modifier
    private String nama;
    private int jmlCetak;
    
    // Constructor
    public Printer(){
        
    }
    
    // Buat Setter & Getter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getJmlCetak() {
        return jmlCetak;
    }

    public void setJmlCetak(int jmlCetak) {
        this.jmlCetak = jmlCetak;
    }


    
    // Buat 2 method. method yang pertama berparameter nama, yang kedua berparameter nama dan jumlahcetak 
   public void cetak(String nama){
        System.out.println("Nama Anda   : " + nama) ;
    }
    public void cetak(String nama, int jmlCetak){
        System.out.println("Hasil Cetak : ");
        for(int i = 1; i <= jmlCetak; i++){
            System.out.println(i + ". " + nama) ;

        }
    }

}
