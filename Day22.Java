package coding100day;
import java.util.Scanner;
public class Coding100day {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Program Hitung Luas Persegi ===");
        System.out.print("Masukkan panjang sisi: ");
        double sisi = input.nextDouble();

        // rumus luas persegi = sisi × sisi
        double luas = sisi * sisi;

        // output hasil
        System.out.println("Sisi persegi = " + sisi + " cm");
        System.out.println("Luas persegi = " + luas + " cm²");

        System.out.println("\nDay 22 coding selesai. Kerja Bagus!");

        input.close(); //tutup scanner
    }
}
