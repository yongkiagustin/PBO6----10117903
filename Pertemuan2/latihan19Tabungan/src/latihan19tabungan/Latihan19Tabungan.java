/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan19tabungan;

import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author Teknisi
 */
public class Latihan19Tabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double saldo = 2500000;
        for (int i = 1; i <= 6; i++) {
            double bunga = saldo * 0.15;
            saldo += bunga;
            System.out.print("Saldo di bulan ke-" + i + " Rp.");
            System.out.println(NumberFormat.getNumberInstance(Locale.US).format(saldo));
        }
    }

}
