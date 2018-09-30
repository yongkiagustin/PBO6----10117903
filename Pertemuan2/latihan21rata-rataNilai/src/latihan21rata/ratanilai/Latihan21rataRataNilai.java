/*
 * nama : yongki agustin
 * kelas : if6k
 * nim : 10117903
 * Todo : - nilai memakai array
          - membuat perulangan input nilai
          - membuat perulangan jumlah siswa
 */
package latihan21rata.ratanilai;

import java.util.Scanner;

/**
 *
 * @author Teknisi
 */
public class Latihan21rataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahsiswa, jml, nilai[];
        float rata, jumlah = 0;

        //Input jumlah mahasiswa
        System.out.print("Masukkan Jumlah Mahasiswa : ");
        jumlahsiswa = input.nextInt();

        //Inisialisasi array
        nilai = new int[jumlahsiswa];

        //Input nilai
        for (int i = 0; i <= jumlahsiswa - 1 ; i++) {
            System.out.print("Nilai Mahasiswa ke-" + (i + 1) + " : ");
            nilai[i] = input.nextInt();
            System.out.println();
        }

        //Hitung Jumlah
        for (int j = 0; j <= jumlahsiswa - 1; j++) {
            jumlah = jumlah + nilai[j];
        }

        //Hitung Rata-rata
        rata = jumlah / jumlahsiswa;

        //Output
        System.out.println("----------------");
        System.out.println("Nilai rata-rata : " + rata);
    }
}
