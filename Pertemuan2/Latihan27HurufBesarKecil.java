/*
 * nama : yongki agustin
 * kelas : if6k
 * nim : 10117903
 * Todo : - membuat inputan untuk nama
          - membuat fungsi uppercase dan lowercase
 */
package latihan27hurufbesarkecil;

import java.util.Scanner;

/**
 *
 * @author YoungDragoon
 */
public class Latihan27HurufBesarKecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String kalimat;

        Scanner input = new Scanner(System.in);
        //inputan nama
        System.out.print("Masukkan Kalimat : ");
        kalimat = input.nextLine();
        //hasil formating
        System.out.println("==== Hasil Formatting ====");
        System.out.println("Huruf Besar\t : " + kalimat.toUpperCase());
        System.out.println("Huruf Besar\t : " + kalimat.toLowerCase());
    }

}
