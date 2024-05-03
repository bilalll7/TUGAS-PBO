/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan2.manusia;

/**
 *
 * @author ASUS
 */
public class Manusia {
    // Buat Properties
    private int tahunLahir;
    private int tahunSaatIni = 2024;
    private int umur;
    private String tanda;

    // Setter and Getter
    public int getTahunLahir() {
        return tahunLahir;
    }

    public void setTahunLahir(int tahunLahir) {
        this.tahunLahir = tahunLahir;
    }

    public int getTahunSaatIni() {
        return tahunSaatIni;
    }

    public void setTahunSaatIni(int tahunSaatIni) {
        this.tahunSaatIni = tahunSaatIni;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getTanda() {
        return tanda;
    }

    public void setTanda(String tanda) {
        this.tanda = tanda;
    }
    
    // Buat Method    
    public void umur(int tahunLahir, int umur, String tanda){
        System.out.println("Tahun Lahir Anda        : " + tahunLahir);
        System.out.println("Hari ini tahun          : " + this.tahunSaatIni);
        umur = this.tahunSaatIni - tahunLahir;
        System.out.println("Umur Kamu saat ini      : " + umur + " Tahun");
        if(umur >= 0 && umur <= 5){
            tanda = "LAGI LUCU LUCUNYA";
        }else if(umur > 5 && umur <= 10){
            tanda = "MASIH ANAK ANAK";
        }else if(umur > 10 && umur <= 13){
            tanda = "MASIH REMAJA";
        }else if(umur > 13 && umur <= 19){
            tanda = "ALAY";
        }else if(umur > 19 && umur <= 29){
            tanda = "LAGI GALAU NYARI JODOH";
        }else if(umur > 29 && umur <= 35){
            tanda = "LAGI SIBUK NYARI UANG";
        }else if(umur > 35 && umur <= 150){
            tanda = "SUDAH TUA";
        }else{
            tanda = "Tidak Terdeteksi kehidupan";
        }
        System.out.println("TANDANYA KAMU           : " + tanda);

    }
    
    
}
