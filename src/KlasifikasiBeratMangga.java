import java.util.Locale;
import java.util.Scanner;

/** Menghitung banyak mangga kecil, sedang, dan besar berdasarkan berat dalam gram. */
public class KlasifikasiBeratMangga {
    public static void main(String[] args) {
        // Input berat pecahan memakai titik, misalnya 199.5 gram.
        Scanner userInput = new Scanner(System.in).useLocale(Locale.US);
        int buahKecil = 0, buahSedang = 0, buahBesar = 0;
        System.out.println("Cek Berat Mangga Kamu");
        System.out.println("Masukkan jumlah mangga yang mau kamu cek:");
        int jumlahMangga = userInput.nextInt();

        // Hentikan program jika banyak mangga tidak memenuhi syarat.
        if (jumlahMangga <= 0) {
            System.out.println("Jumlah mangga harus lebih besar dari 0.");
            userInput.close();
            return;
        }

        int n = 1;
        while (n <= jumlahMangga) {
            System.out.printf("Berat mangga ke-%d (gram):%n", n);
            double beratMangga = userInput.nextDouble();

            // Berat harus positif dan berhingga; NaN dan Infinity bukan berat yang valid.
            if (!Double.isFinite(beratMangga) || beratMangga <= 0) {
                System.out.println("Berat mangga harus berupa angka berhingga lebih besar dari 0.");
                // Ulangi input mangga yang sama tanpa menambah pencacah n.
                continue;
            }

            // Rangkaian if-else memastikan satu mangga hanya masuk satu kategori.
            if (beratMangga < 200) {
                buahKecil += 1;
            } else if (beratMangga < 600) {
                // Batas kategori sedang: 200 gram sampai kurang dari 600 gram.
                buahSedang += 1;
            } else {
                // Berat tepat 600 gram dan di atasnya termasuk kategori besar.
                buahBesar += 1;
            }
            // Pencacah bertambah hanya setelah berat yang valid selesai diklasifikasikan.
            n += 1;
        }

        // Jumlah ketiga kategori harus sama dengan jumlah mangga yang ditimbang.
        System.out.printf("Dari %d mangga yang ditimbang%n", jumlahMangga);
        System.out.printf("Kecil: %d%nSedang: %d%nBesar: %d%n", buahKecil, buahSedang, buahBesar);
        userInput.close();
    }
}
