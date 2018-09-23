/*
 * nama : yongki agustin
 * kelas : if6k
 * nim : 10117903
 * Todo : latihan format penulisan
 */
package latihan11format;


public class Latihan11Format {

    public static void main(String[] args) {

        int v = 1213998;
        int vMinus = -v;

        System.out.printf("value: %d\r\n", v);
        System.out.printf("%%d: %d\r\n", v);
        System.out.printf("%%10d: %10d\r\n", v);
        System.out.printf("%%+10d: %+10d\r\n", v);
        System.out.printf("%%+10d: %+10d\r\n", vMinus);
        System.out.printf("%%,10d: %,10d\r\n", v);
        System.out.printf("%%-10d: %-10d\r\n", v);

        double vDouble = 12131998.123;

        System.out.printf("valueDouble: %f\r\n", vDouble);
        System.out.printf("%%f: %f\r\n", vDouble);
        System.out.printf("%%.2f: %.2f\r\n", vDouble);
        System.out.printf("%%12.2f: %12.2f\r\n", vDouble);
        System.out.printf("%%,12.2f: %,12.2f\r\n", vDouble);

    }

}
