/*
 * nama     : yongki agustin
 * kelas    : if6k
 * nim      : 10117903
 * Todo     : - membuat variable, harus menggunakan double
              - membuat rumus
              - menyamakan inputan menggunakan equals 
              - menampilkan hasil
*/
package latihan17tunjangan;
import java.util.Scanner;
/**
 *
 * @author Teknisi
 */
public class Latihan17Tunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double gajiKotor, totalGaji, tunjangan;
        String menikah;
        String jawaban = "Menikah";
        System.out.println("================Program Tunjangan================");
        System.out.print("Masukkan gaji pokok anda perbulan \t: ");
        Scanner inGaji = new Scanner(System.in);
        gajiKotor = inGaji.nextInt();
        System.out.print("Status anda ? (Menikah/Belum) \t\t: ");
        Scanner inMenikah = new Scanner(System.in);
        menikah = inMenikah.nextLine();
        
        if (menikah.equals(jawaban)) {
            tunjangan = gajiKotor *0.35;
            totalGaji = tunjangan + gajiKotor;
            
        }
        else {
            tunjangan = 0;
            totalGaji = tunjangan + gajiKotor;
        }
        System.out.println("================Hasil Perhitungan Gaji===========");
        System.out.println("Gaji pokok \t: "+totalGaji);
        System.out.println("Tunjangan \t: "+tunjangan);
        System.out.println("Total Gaji \t: "+totalGaji);
    }
    
}
