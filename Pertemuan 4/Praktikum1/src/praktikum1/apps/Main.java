package praktikum1.apps;
import praktikum1.buku.Buku;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        // TODO code application logic here
        Scanner inputData = new Scanner(System.in);
        Buku buku = new Buku();
        System.out.print("ISBN            : "); buku.setIsbn(inputData.nextLine());
        System.out.print("Judul Buku      : "); buku.setJudulBuku(inputData.nextLine());
        System.out.print("Author          : "); buku.setAuthor(inputData.nextLine());
        System.out.print("Harga Buku      : "); buku.setHarga(inputData.nextInt());
        
        
        
        System.out.println("");

        System.out.println("Tampil Katalog Buku");
        System.out.println("===================");
        buku.tampilBuku();
    }
    
}

