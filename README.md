# Modul 13 — Perulangan Java

Kumpulan latihan pemrograman Java untuk mempelajari perulangan `while`, pencacah, akumulator, input pengguna, dan percabangan.

## Daftar program

Seluruh kode berada di folder `src/`. Setiap kelas yang memiliki metode `main` dapat dijalankan secara terpisah.

| Kelas | Fungsi |
| --- | --- |
| `Number1To15` | Menampilkan bilangan 1–15, masing-masing pada baris terpisah. |
| `Number1To20` | Menampilkan bilangan 1–20 dalam satu baris dengan pemisah koma. |
| `MultiPilesOf5` | Menjumlahkan deret 5 + 10 + … + 100, dengan hasil 1050. |
| `JumlahDari5BilanganReal` | Saat ini juga menjumlahkan deret kelipatan 5 hingga 100. |
| `Looping4` | Membaca lima bilangan real dan menghitung jumlahnya. |
| `DaftarHargaBensin` | Menampilkan harga pembelian 1–20 liter bensin dengan harga Rp6.500 per liter. |
| `RataRataBilangan` | Menghitung rata-rata dengan banyak data yang ditentukan pengguna. |
| `KonversiSuhu` | Mengonversi sepuluh input suhu Celsius menjadi Reamur dan Fahrenheit. |
| `TabelKonversiSuhu` | Membuat tabel konversi suhu berdasarkan batas minimum, maksimum, dan kenaikan. |
| `KlasifikasiBeratMangga` | Menghitung jumlah mangga kecil (<200 gram), sedang (200 hingga <600 gram), dan besar (≥600 gram). |

`Main.java` masih kosong. Untuk menjumlahkan lima bilangan real dari input, jalankan `Looping4`.

## Persyaratan

- JDK 8 atau lebih baru, dengan perintah `java` dan `javac` tersedia di terminal.
- Git jika ingin mengunduh repository melalui perintah `clone`.

Tidak memerlukan pustaka tambahan, Maven, atau Gradle.

## Cara menjalankan

Unduh repository dan masuk ke folder proyek:

```sh
git clone https://github.com/CelticAlreadyUse/modul_13_looping.git
cd modul_13_looping
```

Kompilasi satu program dari folder utama proyek:

```sh
mkdir out
javac -d out src/Number1To20.java
java -cp out Number1To20
```

Jika folder `out` sudah ada, lewati perintah `mkdir out`. Hasil program:

```text
1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20
```

Untuk mengompilasi semua program sekaligus:

```sh
javac -d out src/*.java
```

Jalankan program lain dengan mengganti nama kelas, tanpa akhiran `.java`:

```sh
java -cp out Looping4
```

Masukkan lima bilangan ketika diminta. Contohnya, input `1`, `2`, `3`, `4`, dan `5` menghasilkan `Jumlah = 15.0`. Gunakan titik untuk bilangan desimal, misalnya `2.5`.

Di IntelliJ IDEA, buka folder proyek, pilih JDK, lalu jalankan metode `main` pada kelas yang diinginkan.

## Materi yang dipelajari

- Mengatur nilai awal, kondisi berhenti, dan perubahan pencacah pada `while`.
- Menggunakan akumulator untuk menghitung jumlah dan rata-rata.
- Membaca input menggunakan `Scanner`.
- Menggabungkan perulangan dengan `if`, `else`, `break`, dan `continue`.
- Menampilkan tabel menggunakan `System.out.printf`.

Folder `out/` berisi hasil kompilasi dan diabaikan oleh Git melalui `.gitignore`.
