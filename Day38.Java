package coding100day;
import java.util.Scanner;
public class Coding100day {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sebuah angka: ");
        int angka = input.nextInt();

        if (angka > 0) {
            System.out.println("Angka " + angka + " adalah bilangan positif.");
        } else if (angka < 0) {
            System.out.println("Angka " + angka + " adalah bilangan negatif.");
        } else {
            System.out.println("Angka " + angka + " adalah nol.");
        }
    }
}
