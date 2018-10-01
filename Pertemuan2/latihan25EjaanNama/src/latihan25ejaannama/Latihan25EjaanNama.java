/*
 * nama : yongki agustin
 * kelas : if6k
 * nim : 10117903
 * Todo : - membuat inputan untuk nama
          - membuat fungsi hitung panjang nama
          - membuat fungsi ejaan nama
 */
package latihan25ejaannama;

import java.util.Scanner;

/**
 *
 * @author Teknisi
 */
public class Latihan25EjaanNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String nama;
        int panjang; 
        char huruf; 
        Scanner scn = new Scanner(System.in);

        System.out.print("Masukkan nama depan Anda untuk dieja : ");
        nama = scn.next();
        panjang = nama.length(); 

        System.out.println("\nEjaan untuk " + " \"" + nama + "\" adalah : ");

        for (int i = 0; i < panjang; i++) {
            System.out.println("Huruf ke-" + (i + 1) + " : " + nama.charAt(i));
        }
    }
}
