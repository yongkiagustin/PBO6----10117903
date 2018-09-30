/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan22perhitunganlingkaran;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author Teknisi
 */
public class Latihan22PerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i = 1;
        boolean checker = false;
        final double phi = 3.14159;
        do  {
            try {
                System.out.print("masukkan nilai diameter lingkaran : ");
                Scanner inputdia = new Scanner(System.in);
                double diameter = inputdia.nextInt();
                double keliling = phi * diameter;
                double jari = diameter / 2;
                double luas = phi * jari * jari;
                System.out.println("keliling nya adalah " + String.format("%.2f", keliling));
                System.out.println("Jari-jari nya adalah " + String.format("%.2f", jari));
                System.out.println("Luas nya adalah " + String.format("%.2f", luas));
                checker = true;
            } catch (InputMismatchException diameter) {
                System.out.println("salah");
                i++;
            }
        } while (!checker);

    }

}
