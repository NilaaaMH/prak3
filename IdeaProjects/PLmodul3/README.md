# HitungLuasPermukaanKerucut

Proyek ini adalah contoh implementasi algoritma Bubble Sort dalam bahasa pemrograman Java. HItung Luas Permukaan Kerucut digunakan untuk mengurutkan array integer secara ascending.
## Cara Menjalankan Proyek

Untuk menjalankan proyek ini, Anda dapat mengikuti langkah-langkah berikut:

1. Pastikan kamu telah menginstal Java Development Kit (JDK) pada komputer Anda.

2. Buka proyek ini menggunakan IntelliJ IDEA.

3. Buka file `HitungLuasPermukaanKerucut.java` dalam proyek kamu.

4. Kamu akan menemukan metode `main` yang digunakan untuk menguji algoritma Bubble Sort. Kamu dapat mengganti panjang array acak dengan mengedit angka pada baris berikut:

```java
int[] randomArray = generateRandomArray(5);

// Gantilah angka (5) dengan panjang array yang diinginkan.
```


## Metode HitungLuasPermukaanKerucut 

Metode `HItungLuasPermukaanKerucut` adalah inti atau perhitungan dari algoritma Bubble Sort itu sendiri. Metode ini mengambil satu argumen, yaitu array integer yang akan diurutkan.

```java
    import java.util.Scanner;

public class HitungLuasPermukaanKerucut {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jari-jari kerucut: ");
        double jariJari = input.nextDouble();

        System.out.print("Masukkan tinggi kerucut: ");
        double tinggi = input.nextDouble();

        double luasPermukaan = hitungLuasPermukaanKerucut(jariJari, tinggi);

        System.out.println("Luas permukaan kerucut adalah: " + luasPermukaan);

        input.close();
    }

    public static double hitungLuasPermukaanKerucut(double jariJari, double tinggi) {
        double luasSelimut = Math.PI * jariJari * Math.sqrt((jariJari * jariJari) + (tinggi * tinggi));
        double luasAlas = Math.PI * jariJari * jariJari;
        double luasPermukaan = luasSelimut + luasAlas;

        return luasPermukaan;
    }
}

```

5. Jalankan program dengan mengklik tombol "Run" (biasanya berbentuk ikon segitiga hijau) di IntelliJ IDEA.

6. Hasil dari Bubble Sort akan dapat terlihat di Terminal IDEA.

### Contoh Hasil

Setelah menjalankan proyek ini, Anda akan melihat output seperti berikut:

```java
Algoritma
        Masukkan jari-jari kerucut: 2.5
        Masukkan tinggi kerucut: 1.5
        Luas permukaan kerucut adalah: 42.53304863028806
```
## Kontribusi
Kontribusi terhadap proyek BubbleSort ini sangat diterima. Jika ingin berkontribusi, bisa langsung dengan mengirimkan pull request dengan perbaikan atau peningkatan yang diusulkan.

## Lisensi

This project is licensed under the [MIT License](LICENSE).

Copyright © [Nilla Mery Handayani]

