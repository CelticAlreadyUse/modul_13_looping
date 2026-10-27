import java.util.Locale;
import java.util.Scanner;

/** Menampilkan tabel konversi suhu dari batas minimum hingga maksimum. */
public class TabelKonversiSuhu {
    public static void main(String[] args) {
        // Locale.US membuat input desimal menggunakan titik, misalnya 0.5.
        Scanner userInput = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Tabel Konversi Celsius ke Reamur dan Fahrenheit");
        System.out.println("Masukkan nilai suhu minimum:");
        double suhuMinimum = userInput.nextDouble();
        System.out.println("Masukkan nilai suhu maksimum:");
        double suhuMaksimum = userInput.nextDouble();
        System.out.println("Masukkan selisih kenaikan:");
        double nilaiSelisih = userInput.nextDouble();

        // Tolak nilai khusus double yang tidak mewakili suhu atau kenaikan berhingga.
        if (!Double.isFinite(suhuMinimum) || !Double.isFinite(suhuMaksimum)
                || !Double.isFinite(nilaiSelisih)) {
            System.out.println("Suhu dan selisih kenaikan harus berupa angka berhingga.");
            userInput.close();
            return;
        }
        // Kenaikan positif diperlukan agar suhu bergerak menuju batas maksimum.
        if (nilaiSelisih <= 0 || suhuMinimum > suhuMaksimum) {
            System.out.println("Selisih kenaikan harus lebih besar dari 0 dan suhu minimum tidak boleh melebihi maksimum.");
            userInput.close();
            return;
        }

        // Lebar kolom 12 karakter; tanda minus membuat teks judul rata kiri.
        System.out.printf("%-12s %-12s %-12s%n", "Celsius", "Reamur", "Fahrenheit");
        double suhu = suhuMinimum;
        // Batas maksimum ikut dicetak jika dapat dicapai oleh langkah kenaikan.
        while (suhu <= suhuMaksimum) {
            // Pembagian double menjaga hasil pecahan pada rumus konversi.
            double reamur = 4.0 / 5.0 * suhu;
            double fahrenheit = 9.0 / 5.0 * suhu + 32;
            // .2f menampilkan dua angka desimal; %n mengakhiri baris satu kali.
            System.out.printf(Locale.US, "%-12.2f %-12.2f %-12.2f%n", suhu, reamur, fahrenheit);

            if (suhu == suhuMaksimum) {
                break;
            }
            double suhuBerikutnya = suhu + nilaiSelisih;
            // Pada double, kenaikan yang terlalu kecil bisa tidak mengubah nilai suhu.
            if (suhuBerikutnya <= suhu) {
                System.out.println("Kenaikan terlalu kecil untuk mengubah suhu pada ketelitian double.");
                break;
            }
            suhu = suhuBerikutnya;
        }
        userInput.close();
    }
}
