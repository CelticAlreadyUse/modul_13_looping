/**
 * Menjumlahkan kelipatan 5 dari 5 sampai 100 menggunakan perulangan while.
 * Catatan: isi program saat ini bukan penjumlahan lima bilangan real dari input.
 */
public class JumlahDari5BilanganReal {
    public static void main(String[] args) {
        // Akumulator menyimpan total, sedangkan bilangan menyimpan suku saat ini.
        int jumlah = 0;
        int bilangan = 5;
        // Batas inklusif membuat bilangan 100 ikut dijumlahkan.
        while (bilangan <= 100) {
            jumlah += bilangan;
            // Bertambah 5 agar urutannya menjadi 5, 10, 15, ..., 100.
            bilangan += 5;
        }
        System.out.println("Jumlah 5 + 10 + ... + 100 = " + jumlah);
    }
}
