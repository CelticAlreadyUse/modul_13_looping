/** Menampilkan tabel harga bensin untuk pembelian 1 sampai 20 liter. */
public class DaftarHargaBensin {
    public static void main(String[] args) {
        // Harga per liter bersifat tetap, sehingga dideklarasikan sebagai konstanta.
        final int HARGA_PER_LITER = 6500;
        int fuelAmount = 1;
        System.out.println("Jumlah Liter      Harga(Rp)");
        System.out.println("==========================");
        // Setiap perulangan menghitung harga untuk satu jumlah liter.
        while (fuelAmount <= 20) {
            // Lebar kolom menjaga posisi harga tetap rapi untuk angka 1 maupun 20.
            System.out.printf("%-18dRp %d%n", fuelAmount, HARGA_PER_LITER * fuelAmount);
            fuelAmount += 1;
        }
        System.out.println("==========================");
    }
}
