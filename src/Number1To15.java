/** Menampilkan bilangan 1 sampai 15, masing-masing pada baris terpisah. */
public class Number1To15 {
    public static void main(String[] args) {
        // Inisialisasi pencacah sebelum memasuki perulangan.
        int bilangan = 1;
        // Batas <= 15 membuat angka 15 tetap ditampilkan.
        while (bilangan <= 15) {
            System.out.println(bilangan);
            // Pencacah bertambah agar kondisi akhirnya bernilai false.
            bilangan += 1;
        }
    }
}
