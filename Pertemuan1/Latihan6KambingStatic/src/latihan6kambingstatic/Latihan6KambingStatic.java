/*
 * nama : yongki agustin
 * kelas : if6k
 * nim : 10117903
 * Todo : latihan kedua   
 */
package latihan6kambingstatic;

public class Latihan6KambingStatic {

    //nama pemilik kambing
    public static final String goat_owner = "Peternak";

    public static void main(String[] args) {
        Mamalia.currentKambing = 10117903;
        System.out.printf("%s memiliki kambing sebanyak %d\r\n", goat_owner, Mamalia.currentKambing);

    }
}

class Mamalia {
    public static int currentKambing;
}
