import java.util.Locale;
import java.util.Scanner;

/** Menghitung rata-rata sejumlah bilangan yang banyak datanya ditentukan pengguna. */
public class RataRataBilangan {
    public static void main(String[] args) {
        // Gunakan titik sebagai pemisah desimal saat memasukkan bilangan pecahan.
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Banyak data: ");
        int n = input.nextInt();
        // Validasi ini juga mencegah pembagian dengan nol saat menghitung rata-rata.
        if (n <= 0) {
            System.out.println("Banyak data harus lebih dari nol.");
        } else {
            // Akumulator bertipe double agar bagian pecahan ikut dijumlahkan.
            double jumlah = 0;
            int dataKe = 1;
            while (dataKe <= n) {
                System.out.print("Data ke-" + dataKe + ": ");
                double bilangan = input.nextDouble();
                jumlah += bilangan;
                // Satu kenaikan pencacah mewakili satu data yang sudah dibaca.
                dataKe++;
            }
            // Rumus rata-rata: total seluruh nilai dibagi banyaknya data.
            double rataRata = jumlah / n;
            System.out.println("Rata-rata = " + rataRata);
        }
        input.close();
    }
}
