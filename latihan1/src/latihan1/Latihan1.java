/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan1;

/**
 *
 * @author ASUS
 */
public class Latihan1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Keliling dan Luas Persegi
        //Deklarasi Variable
        int sisiPersegi;
        double kelilingPersegi;
        double luasPersegi;
        
        // Isi nilai ke dalam variable
        sisiPersegi = 10;
        
        // Rumus Keliling Persegi = 4 * sisi
        kelilingPersegi = 4 * sisiPersegi;
        
        // Rumus Luas Persegi = sisi * sisi
        luasPersegi = sisiPersegi * sisiPersegi;
        
        // Output
        System.out.println("Menghitung Keliling dan Luas Persegi");
        System.out.println("====================================\n");
        System.out.println("Keliling Persegi = " + kelilingPersegi);
        System.out.println("Luas Persegi\t = " + luasPersegi + "\n");
        
        
        
        
        // Keliling dan Luas persegi panjang 
        // Deklarasi Variable
        int panjangPersegiPanjang;
        int lebarPersegiPanjang;
        double kelilingPersegiPanjang;
        double luasPersegiPanjang; 
        
        // Isi nilai ke dalam Variable
        panjangPersegiPanjang = 10;
        lebarPersegiPanjang = 5;
        
        // Rumus Keliling Persegi Panjang = 2 * (p + l)
        kelilingPersegiPanjang = 2 * (panjangPersegiPanjang + lebarPersegiPanjang);
        
        // Rumus Luas Persegi Panjang = p * l
        luasPersegiPanjang = panjangPersegiPanjang * lebarPersegiPanjang;
        
        // Output
        System.out.println("Menghitung Keliling dan Luas Persegi Panjang");
        System.out.println("=============================================\n");
        System.out.println("Keliling Persegi Panjang = " + kelilingPersegiPanjang);
        System.out.println("Luas Persegi Panjang\t = " + luasPersegiPanjang + "\n");
        
        
        
        
        // Keliling dan Luas Lingkaran
        // Deklarasi Variable
        int r;
        final double PHI;
        double kelilingLingkaran;
        double luasLingkaran;
        
        // Isi nilai ke dalam Variable
        r = 7;
        PHI = 3.14;
        
        // Rumus Keliling Lingkaran = 2 * PHI * r
        kelilingLingkaran = 2 * PHI * r;
        
        // Rumus Luas Lingkaran = PHI * r * r
        luasLingkaran = PHI * r * r;
        
         // Output
        System.out.println("Menghitung Keliling dan Luas Lingkaran");
        System.out.println("=======================================\n");
        System.out.println("Keliling Lingkaran = " + kelilingLingkaran);
        System.out.println("Luas Lingkaran\t = " + luasLingkaran);
    }
    
}
