import java.util.Scanner;

public class Mahasiswa {
    public static void main(String[] args) {

        // Membuat objek Scanner untuk membaca input dari pengguna
        Scanner input = new Scanner(System.in);

        /** @param nama mahasiswa.
         *
         */
        // Meminta pengguna memasukkan nama
        System.out.print("Masukkan nama mahasiswa: ");
        String nama = input.nextLine();

        // Meminta pengguna memasukkan NIM
        System.out.print("Masukkan NIM mahasiswa: ");
        String nim = input.nextLine();

        // Menampilkan informasi yang diinputkan
        System.out.println("Nama mahasiswa: " + nama);
        System.out.println("NIM mahasiswa: " + nim);

        // Menutup objek Scanner
        input.close();
    }
}
