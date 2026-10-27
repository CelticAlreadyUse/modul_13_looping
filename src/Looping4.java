import java.util.Locale;
import java.util.Scanner;

/** Membaca lima bilangan real, kemudian menampilkan jumlahnya. */
public class Looping4 {
    public static void main(String[] args) {
        // Locale.US menggunakan titik untuk desimal, misalnya 2.5.
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        // double menampung bilangan pecahan; jumlah berperan sebagai akumulator.
        double jumlah = 0;
        int ulang = 1;
        // Pencacah 1 sampai 5 membuat program menerima tepat lima bilangan.
        while (ulang <= 5) {
            System.out.print("Data ke-" + ulang + ": ");
            double bilangan = input.nextDouble();
            // Setara dengan jumlah = jumlah + bilangan.
            jumlah += bilangan;
            ulang++;
        }
        System.out.println("Jumlah = " + jumlah);
        // Tutup Scanner setelah semua proses pembacaan selesai.
        input.close();
    }
}
