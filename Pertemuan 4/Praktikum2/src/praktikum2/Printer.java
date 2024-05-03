
package praktikum2;


public class Printer {
    // OverLoading
    // Buat method yang sama tapi harus beda parameter nya
    public String cetakPesan(){
        String pesan = "Ini adalah Method tanpa parameter";
        return pesan;
    }
    
    public String cetakPesan(String text){
        String pesan = "Ini adalah Method dengan parameter bertipe string " + "Dengan nilainya adalah " + text;
        return pesan;
    }
    public String cetakPesan(int bilangan){
        String pesan = "ini adalah blablabla " + "dengan nilainya " + bilangan;
        return pesan;
    }
    public String cetakPesan(String text, int bilangan){
        String pesan = "Ini adalah Method dengan parameter bertipe string " + "Dengan nilainya adalah " + text + " & " + bilangan;
        return pesan;
    }
    
    public void cetakVolume(Kotak kotak){
        if(kotak.getBentuk().equals("Kubus")){
            System.out.println("Nilai Volume Kubus");
            System.out.println("===================");
            System.out.println("Nilai Sisi         : " + kotak.getSisi());
            System.out.println("Nilai Volume       : " + kotak.hitungVolumeKubus(kotak));

            
        }else if(kotak.getBentuk().equals("Balok")){
            System.out.println("Nilai Volume Balok");
            System.out.println("===================");
            System.out.println("Nilai Panjang      : " + kotak.getPanjang());
            System.out.println("Nilai Lebar        : " + kotak.getLebar());
            System.out.println("Nilai Tinggi       : " + kotak.getTinggi());
            System.out.println("Nilai Volume       : " + kotak.hitungVolumeBalok(kotak));
        }else {
            System.out.println("Error !");
            
        }
    }
}
