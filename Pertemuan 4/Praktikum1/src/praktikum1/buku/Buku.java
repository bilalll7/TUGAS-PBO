/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum1.buku;

/**
 *
 * @author student
 */
public class Buku {
    // create properties
    private String isbn;
    private String judulBuku;
    private String author;
    private int harga;
    
    
    // create constructor
    public Buku(){
        
    }
    
    // deklarasi getter dan setter
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getJudulBuku() {
        return judulBuku;
    }

    public void setJudulBuku(String judulBuku) {
        this.judulBuku = judulBuku;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
    
    
    
    // Create method
    public void tampilBuku(){
        System.out.println("ISBN        : " + this.isbn);
        System.out.println("Judul Buku  : " + this.judulBuku);
        System.out.println("Author      : " + this.author);
        System.out.println("Harga Buku  : " + this.harga);
    }
}
