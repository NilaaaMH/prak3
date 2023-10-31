import java.util.Scanner;

public class KalkulatorSederhana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b;

        System.out.print("Masukkan angka pertama: ");
        a = input.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        b = input.nextDouble();

        System.out.println("Pilih operasi (1: Penambahan, 2: Pengurangan, 3: Perkalian, 4: Pembagian):");
        int pilihan = input.nextInt();

        double hasil = 0;

        switch (pilihan) {
            case 1:
                hasil = a + b;
                break;
            case 2:
                hasil = a - b;
                break;
            case 3:
                hasil = a * b;
                break;
            case 4:
                if (b != 0) {
                    hasil = a / b;
                } else {
                    System.out.println("Pembagian oleh nol tidak diperbolehkan.");
                    System.exit(0);
                }
                break;
            default:
                System.out.println("Operasi Kalkulator Tidak Valid !.");
                System.exit(0);
        }

        System.out.println("Hasil operasi : " + hasil);
        input.close();
    }
}
