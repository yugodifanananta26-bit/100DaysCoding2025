package coding100day;
import java.util.Scanner;

public class Coding100day {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("===== LATIHAN OPERATOR TERNARY =====");
        System.out.print("Masukkan sebuah angka: ");
        int angka = input.nextInt();
        
        String jenis = (angka > 0) ? "Positif" : (angka < 0) ? "Negatif" : "Nol";
        
        System.out.println("Angka " + angka + " adalah " + jenis + ".");

    }
}
