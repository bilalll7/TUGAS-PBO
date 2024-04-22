/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan2;

/**
 *
 * @author ASUS
 */
public class Latihan2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Menampilkan bilangan genap dari 1 s/d 100");
        System.out.println("=========================================");
        
       // Buat perulangan menggunakan for
        for(int i = 2; i <= 100; i++){
            // cari bilangan genap nya menggunakan mod jika sisa bagi 2 nya 0
            if(i % 2 == 0){
                System.out.print(i);
                if((i % 5 == 0) && (i != 100)){
                    System.out.println(",");
                }else if(i != 100){
                    System.out.print(", ");
                }else {
                    System.out.println();
            }
            }
        }
        
    }
    
}
