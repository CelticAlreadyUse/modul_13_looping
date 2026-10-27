/** Menghitung jumlah deret 5 + 10 + 15 + ... + 100. */
public class MultiPilesOf5 {
    public static void main(String[] args) {
        // Nilai awal total harus nol agar tidak mengubah hasil penjumlahan.
        int jumlah = 0;
        int bilangan = 5;
        // Kondisi diperiksa sebelum badan while dijalankan.
        while (bilangan <= 100) {
            // Tambahkan suku saat ini ke akumulator, lalu pindah ke suku berikutnya.
            jumlah += bilangan;
            bilangan += 5;
        }
        // Ada 20 suku; hasil penjumlahannya adalah 1050.
        System.out.println("Jumlah 5 + 10 + ... + 100 = " + jumlah);
    }
}
