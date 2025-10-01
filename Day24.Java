package coding100day;
import java.util.Scanner;

public class Coding100day {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Program Hitung Luas Lingkaran ===");

        // Input jari-jari lingkaran
        System.out.print("Masukkan jari-jari lingkaran (cm): ");
        double jariJari = input.nextDouble();

        // Rumus luas lingkaran = π × r × r
        double luas = Math.PI * jariJari * jariJari;

        // Output hasil
        System.out.println("Jari-jari = " + jariJari + " cm");
        System.out.println("Luas      = " + luas + " cm²");

        input.close();
    }
}
