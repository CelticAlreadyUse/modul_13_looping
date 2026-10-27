import java.util.Locale;
import java.util.Scanner;

/** Mengonversi sepuluh input suhu Celsius ke Reamur dan Fahrenheit. */
public class KonversiSuhu {
    public static void main(String[] args) {
        // Input desimal memakai titik, misalnya 36.5.
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        int urutan = 1;
        // Setiap putaran membaca satu suhu dan menghasilkan dua hasil konversi.
        while (urutan <= 10) {
            System.out.print("Celsius ke-" + urutan + ": ");
            double celsius = input.nextDouble();
            // Gunakan 4.0 dan 9.0 agar pembagian menghasilkan pecahan (double).
            // Jika ditulis 4 / 5, pembagian int menghasilkan 0, bukan 0.8.
            double reamur = 4.0 / 5 * celsius;
            double fahrenheit = 9.0 / 5 * celsius + 32;
            System.out.println("Reamur = " + reamur);
            System.out.println("Fahrenheit = " + fahrenheit);
            // Naikkan pencacah agar perulangan berhenti setelah input ke-10.
            urutan++;
        }
        input.close();
    }
}
