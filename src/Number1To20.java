/** Menampilkan bilangan 1 sampai 20 dalam satu baris dengan pemisah koma. */
public class Number1To20 {
    public static void main(String[] args) {
        int bilangan = 1;
        while (bilangan <= 20) {
            // print tidak membuat baris baru, sehingga angka tersusun mendatar.
            System.out.print(bilangan);
            // Pemisah tidak dicetak setelah angka terakhir agar tidak ada koma di akhir.
            if (bilangan < 20) {
                System.out.print(", ");
            }
            bilangan++;
        }
        // Akhiri baris setelah seluruh angka selesai dicetak.
        System.out.println();
    }
}
