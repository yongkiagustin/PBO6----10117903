/*
 * nama : yongki agustin
 * kelas : if6k
 * nim : 10117903
 * Todo : - membuat format tanggal dan waktu
          - membuat nama hari indonesia
          - menampilkan format tanggal
 */
package latihan26waktusaatini;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Teknisi
 */
public class Latihan26WaktuSaatIni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date date = new Date();
        Calendar cal = Calendar.getInstance();
        int daysOfWeek = cal.get(Calendar.DAY_OF_WEEK);// hari dalam format angka

//     format tanggal dan waktu
        SimpleDateFormat formatIndo = new SimpleDateFormat("dd MMM yyyy HH:mm:ss");

//     data array -> nama hari Indonesia
        String[] strDays = new String[]{"Sabtu", "Minggu", "Senin", "Selasa", "Rabu",
             "Kamis", "Jumat"};

//     menampilkannya sesuai format
        System.out.println("Hari ini adalah hari : " + (strDays[daysOfWeek]) + " ,"
                + formatIndo.format(date));

    }
}
