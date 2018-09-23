/*
 * nama : yongki agustin
 * kelas : if6k
 * nim : 10117903
 * Todo : latihan kedua   
 */
package latihan5kambingglobal;


public class Latihan5KambingGlobal {

    //Inisialisasi nilai kambing
    int currentKambing = 60;

    //Menampilkan jumlah kambing yang ada
    public void getKambing() {
        System.out.printf("Jumlah Kambing: %d\r\n", currentKambing);
    }

    //Menambah dan menampilkan jumlah kambing
    public void addKambing() {

        currentKambing = currentKambing + 5;

        System.out.printf("Jumlah Kambing setelah ditambah: %d\r\n", currentKambing);
    }

    public static void main(String[] args) {
        Latihan5KambingGlobal kambing = new Latihan5KambingGlobal();
        kambing.getKambing();
        kambing.addKambing();
        kambing.getKambing();

    }
}
