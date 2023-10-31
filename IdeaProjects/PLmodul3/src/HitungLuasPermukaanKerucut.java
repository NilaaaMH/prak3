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
