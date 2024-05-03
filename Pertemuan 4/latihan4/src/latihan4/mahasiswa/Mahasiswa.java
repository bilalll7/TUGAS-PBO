/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan4.mahasiswa;

/**
 *
 * @author ASUS
 */
public class Mahasiswa {
    //
    private String nama;
    private String nim;
    private String kelas;
    private String prodi;
    
    // Constructor
    public Mahasiswa(String prodi){
        this.prodi = prodi;
        System.out.println("Masukan Identitas dan Nilai Mahasiswa Ke - 1");
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }
    
    public void displayMahasiswa(String nama, String nim, String kelas){
        System.out.println("Data Nilai Mahasiswa Ke - 1");
        System.out.println("Nama Mahasiswa    : " + nama);
        System.out.println("NIM Mahasiswa     : " + nim);
        System.out.println("Kelas Mahasiswa   : " + kelas);
        System.out.println("Program Studi     : " + prodi);
    }
}
