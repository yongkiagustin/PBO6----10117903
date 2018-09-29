/*
 * nama     : yongki agustin
 * kelas    : if6k
 * nim      : 10117903
 * Todo     : - membuat tampilan(done) 
              - memb
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
        double gajiKotor, totalGaji;
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
            totalGaji = gajiKotor *0.35 + gajiKotor;
            
        }
        else {
            totalGaji = gajiKotor;
        }
        System.out.println("================Hasil Perhitungan Gaji===========");
        System.out.println("Gaji anda adalah : "+totalGaji);
    }
    
}
