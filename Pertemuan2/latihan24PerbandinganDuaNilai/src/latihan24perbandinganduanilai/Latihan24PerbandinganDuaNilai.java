/*
 * nama : yongki agustin
 * kelas : if6k
 * nim : 10117903
 * Todo : - membuat fungsi catch agar bisa input hanya angka
          - membuat looping do while
 */
package latihan24perbandinganduanilai;

import java.util.Scanner;

/**
 *
 * @author Teknisi
 */
public class Latihan24PerbandinganDuaNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nilai1;
        int nilai2;
        String lagi; //variabel pengontrol aktifitas
        Scanner input = new Scanner(System.in);

        System.out.println("========Program Perbandingan Nilai========");
//        menggunakan looping do while
        do {
            System.out.print("Masukkan nilai pertama : ");
            nilai1 = input.nextInt();
            System.out.print("Masukkan nilai kedua : ");
            nilai2 = input.nextInt();

//            rumus perbandingan
            if (nilai1 > nilai2) {
                System.out.println("Hasil : " + nilai1 + " Lebih besar dari " + nilai2 + "\n");
            } else if (nilai1 < nilai2) {
                System.out.println("Hasil : " + nilai1 + " Lebih kecil dari " + nilai2 + "\n");
            } else {
                System.out.println("Hasil : " + nilai1 + " sama dengan " + nilai2 + "\n");
            }

//            ketikkan "Tidak" bila ingin berhenti aktifitas
            System.out.print("Ulangi Aktifitas ? (Ya/Tidak) : ");
            lagi = input.next();

            System.out.println("");
        } while (!lagi.equalsIgnoreCase("tidak"));
    }

}
