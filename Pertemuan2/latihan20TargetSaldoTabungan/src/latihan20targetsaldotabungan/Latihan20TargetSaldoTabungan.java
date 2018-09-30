/*
 * nama : yongki agustin
 * kelas : if6k
 * nim : 10117903
 * Todo : - membuat perulangan dari while
          - mencari rumus yang tepat
          - membaut format uang
 */
package latihan20targetsaldotabungan;

import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author Teknisi
 */
public class Latihan20TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int jangkaWaktu = 6000000;
        float bunga = 0.08f;
        float saldo = 3500000f;

        int i = 1;
        while (saldo <= jangkaWaktu) {
            saldo = saldo + (saldo * bunga);
            System.out.print("Saldo di bulan ke-" + i + " Rp.");
            System.out.println(NumberFormat.getNumberInstance(Locale.US).format(saldo));
            i++;
        }
    }

}
