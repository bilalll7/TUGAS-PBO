
package praktikum2;


public class Main {


    public static void main(String[] args) {
//        Printer printer = new Printer();
//        System.out.println(printer.cetakPesan());
//        System.out.println(printer.cetakPesan("Pemrograman Web"));
//        System.out.println(printer.cetakPesan(2024));
//        System.out.println(printer.cetakPesan("Pemrograman Web", 2024));
        
        Kotak kotak = new Kotak();
        Kotak kotak2 = new Kotak(6);
        Kotak kotak3 = new Kotak(6, 7, 5);
        Kotak kotak4 = new Kotak(10);
        
        Printer printer = new Printer();
        printer.cetakVolume(kotak3);
        printer.cetakVolume(new Kotak(8));

        
    }
    
}
