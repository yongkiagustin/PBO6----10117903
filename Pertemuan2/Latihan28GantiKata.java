/*
 * nama : yongki agustin
 * kelas : if6k
 * nim : 10117903
 * Todo : - membuat inputan untuk kalimat
          - membuat inputan kata yg akan diganti
          - membuat inputan kata baru
 */
package latihan28gantikata;

import java.util.Scanner;

/**
 *
 * @author YoungDragoon
 */
public class Latihan28GantiKata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String kata1;
        String kata2;
        String kata3;
        Scanner kata = new Scanner(System.in);
        System.out.println("===Program Mengganti Kalimat===");
        System.out.println("");
        System.out.print("Masukkan Kalimat : ");
        kata1 = kata.nextLine();
        System.out.print("Ganti Kata : ");
        kata2 = kata.next();
        System.out.print("Menjadi Kata : ");
        kata3 = kata.next();

        System.out.println("\n" + "===Hasil Formatting===");
        System.out.println("Kalimat awal : " + kata1);
        String kataBaru = kata1.replace(kata2, kata3);
        System.out.println("Kalimat Baru : " + kataBaru);
    }

}
