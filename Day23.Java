package coding100day;
import java.util.Scanner;
public class Coding100day {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Program Hitung Luas Persegi Panjang ===");

        // input panjang
        System.out.print("Masukkan panjang: ");
        double panjang = input.nextDouble();

        // input lebar
        System.out.print("Masukkan lebar: ");
        double lebar = input.nextDouble();

        // proses hitung luas
        double luas = panjang * lebar;

        // output hasil
        System.out.println("\nPanjang = " + panjang + " cm");
        System.out.println("Lebar   = " + lebar + " cm");
        System.out.println("Luas    = " + luas + " cm2");
        input.close();
    }
}
