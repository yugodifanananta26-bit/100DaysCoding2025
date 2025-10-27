package coding100day;
import java.util.Scanner;

public class Coding100day {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("===== LATIHAN OPERATOR TERNARY =====");
        System.out.print("Masukkan sebuah angka: ");
        int angka = input.nextInt();
        
        String hasil = (angka % 2 == 0) ? "Genap" : "Ganjil";
        
        System.out.println("Angka " + angka + " adalah " + hasil + ".");

    }
}

