
package praktikum2;


public class Kotak {
    
    private int sisi;
    private int panjang;
    private int lebar;
    private int tinggi;
    private String bentuk;
    
    // overloading
    // Deklarasikan COnstructor
    public Kotak(){
        System.out.println("Bentuk kotak belum terdefinisi");
    }
    public Kotak(int sisi){
        System.out.println("Bentuk kotak anda kubus"); 
        this.sisi = sisi;
        this.bentuk = "Kubus";
    }
    public Kotak(int panjang, int lebar, int tinggi){
        System.out.println("Bentuk kotak anda balok");  
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
        this.bentuk = "Balok";
    }

    public int getSisi() {
        return sisi;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    public int getPanjang() {
        return panjang;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public String getBentuk() {
        return bentuk;
    }

    public void setBentuk(String bentuk) {
        this.bentuk = bentuk;
    }
    
    
    
    public int hitungVolumeKubus(Kotak kubus){
        int volume;
        volume = kubus.sisi * kubus.sisi * kubus.sisi;
        return volume;
    }
    public int hitungVolumeBalok(Kotak balok){
        int volume;
        volume = balok.panjang * balok.lebar * balok.tinggi;
        return volume;
    }
}
