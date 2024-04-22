/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan3;

/**
 *
 * @author ASUS
 */
public class Latihan3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Deklarasi Variable
       int saldoAwal;
       int saldoTarget;
       double bunga;
       
       // inputkan nilai ke dalam variable
       saldoAwal = 1000000;
       saldoTarget = 2000000;
       bunga = 0.10;
       
       // inputkan bulan
       int counter = 1;
       
       // buat perulangan
       while(saldoAwal < saldoTarget){
           saldoAwal += saldoAwal * bunga;
           System.out.println("Saldo di bulan ke-" + counter + " : Rp. " + saldoAwal);
           counter++;
       }
    }
    
}
